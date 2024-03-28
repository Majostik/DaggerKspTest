package com.example.testkspproject

import android.app.Application
import com.example.core.ComponentDependenciesProvider
import com.example.core.HasComponentDependencies
import com.example.testkspproject.di.AppEntryPoint
import dagger.hilt.EntryPoints

class App: Application(), HasComponentDependencies {

    override val dependencies: ComponentDependenciesProvider
        get() = DependenciesManager.getDependencies(EntryPoints.get(this, AppEntryPoint::class.java))

}