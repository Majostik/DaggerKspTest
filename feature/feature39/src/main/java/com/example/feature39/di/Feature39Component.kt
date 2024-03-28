package com.example.feature39.di

import com.example.feature39.di.module.Feature39ModuleOne
import dagger.Component

@Component(
    modules = [Feature39ModuleOne::class]
)
interface Feature39Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature39Component
    }
}