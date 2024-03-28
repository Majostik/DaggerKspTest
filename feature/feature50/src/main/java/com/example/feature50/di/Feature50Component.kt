package com.example.feature50.di

import com.example.feature50.di.module.Feature50ModuleOne
import dagger.Component

@Component(
    modules = [Feature50ModuleOne::class]
)
interface Feature50Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature50Component
    }
}