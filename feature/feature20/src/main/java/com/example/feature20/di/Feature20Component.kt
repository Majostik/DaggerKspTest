package com.example.feature20.di

import com.example.feature20.di.module.Feature20ModuleOne
import dagger.Component

@Component(
    modules = [Feature20ModuleOne::class]
)
interface Feature20Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature20Component
    }
}