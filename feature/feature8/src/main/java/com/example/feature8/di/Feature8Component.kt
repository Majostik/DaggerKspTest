package com.example.feature8.di

import com.example.feature8.di.module.Feature8ModuleOne
import dagger.Component

@Component(
    modules = [Feature8ModuleOne::class]
)
interface Feature8Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature8Component
    }
}