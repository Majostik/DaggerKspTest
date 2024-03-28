package com.example.feature25.di

import com.example.feature25.di.module.Feature25ModuleOne
import dagger.Component

@Component(
    modules = [Feature25ModuleOne::class]
)
interface Feature25Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature25Component
    }
}