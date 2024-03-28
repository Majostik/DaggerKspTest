package com.example.feature4.di

import com.example.feature4.di.module.Feature4ModuleOne
import dagger.Component

@Component(
    modules = [Feature4ModuleOne::class]
)
interface Feature4Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature4Component
    }
}