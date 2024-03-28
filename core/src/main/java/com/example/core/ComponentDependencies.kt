package com.example.core

import android.content.Context
import dagger.MapKey
import kotlin.reflect.KClass

interface ComponentDependencies

inline fun <reified T : ComponentDependencies> Context.findComponentDependencies(): T {
    return getDependencies(T::class.java, findComponentDependenciesProvider(this))
}

typealias ComponentDependenciesProvider = Map<Class<out ComponentDependencies>, @JvmSuppressWildcards ComponentDependencies>

interface HasComponentDependencies {
    val dependencies: ComponentDependenciesProvider
}

@MapKey
@Target(AnnotationTarget.FUNCTION)
annotation class ComponentDependenciesKey(val value: KClass<out ComponentDependencies>)

@Suppress("UNCHECKED_CAST")
fun <T : ComponentDependencies> getDependencies(clazz: Class<T>, dependencyHolder: HasComponentDependencies): T {
    val dependencies = dependencyHolder.dependencies.get(clazz) as? T
    return dependencies ?: throw IllegalStateException("Missing Dependency")
}

inline fun <reified T : Any> T.findComponentDependenciesProvider(context: Context): HasComponentDependencies {
    val appContext = context.applicationContext
    return when {
        this is HasComponentDependencies -> this
        appContext is HasComponentDependencies -> appContext
        else -> throw IllegalStateException("Can not find suitable dagger provider for $this")
    }
}