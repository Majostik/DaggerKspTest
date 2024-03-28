package com.example.feature44.di

import com.example.feature44.di.module.Feature44ModuleOne
import dagger.Component

@Component(
    modules = [Feature44ModuleOne::class]
)
interface Feature44Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature44Component
    }
}