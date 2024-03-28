package com.example.feature17.di

import com.example.feature17.di.module.Feature17ModuleOne
import dagger.Component

@Component(
    modules = [Feature17ModuleOne::class]
)
interface Feature17Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature17Component
    }
}