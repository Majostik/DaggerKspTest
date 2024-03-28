package com.example.feature45.di

import com.example.feature45.di.module.Feature45ModuleOne
import dagger.Component

@Component(
    modules = [Feature45ModuleOne::class]
)
interface Feature45Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature45Component
    }
}