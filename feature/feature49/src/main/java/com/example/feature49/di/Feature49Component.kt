package com.example.feature49.di

import com.example.feature49.di.module.Feature49ModuleOne
import dagger.Component

@Component(
    modules = [Feature49ModuleOne::class]
)
interface Feature49Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature49Component
    }
}