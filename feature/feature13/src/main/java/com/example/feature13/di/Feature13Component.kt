package com.example.feature13.di

import com.example.feature13.di.module.Feature13ModuleOne
import dagger.Component

@Component(
    modules = [Feature13ModuleOne::class]
)
interface Feature13Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature13Component
    }
}