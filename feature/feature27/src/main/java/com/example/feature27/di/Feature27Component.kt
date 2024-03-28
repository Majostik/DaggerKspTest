package com.example.feature27.di

import com.example.feature27.di.module.Feature27ModuleOne
import dagger.Component

@Component(
    modules = [Feature27ModuleOne::class]
)
interface Feature27Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature27Component
    }
}