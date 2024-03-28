package com.example.feature38.di

import com.example.feature38.di.module.Feature38ModuleOne
import dagger.Component

@Component(
    modules = [Feature38ModuleOne::class]
)
interface Feature38Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature38Component
    }
}