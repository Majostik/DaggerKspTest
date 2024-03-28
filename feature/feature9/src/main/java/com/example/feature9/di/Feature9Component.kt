package com.example.feature9.di

import com.example.feature9.di.module.Feature9ModuleOne
import dagger.Component

@Component(
    modules = [Feature9ModuleOne::class]
)
interface Feature9Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature9Component
    }
}