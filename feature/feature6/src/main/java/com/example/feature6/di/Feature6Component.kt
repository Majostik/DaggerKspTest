package com.example.feature6.di

import com.example.feature6.di.module.Feature6ModuleOne
import dagger.Component

@Component(
    modules = [Feature6ModuleOne::class]
)
interface Feature6Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature6Component
    }
}