package com.example.feature15.di

import com.example.feature15.di.module.Feature15ModuleOne
import dagger.Component

@Component(
    modules = [Feature15ModuleOne::class]
)
interface Feature15Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature15Component
    }
}