package com.example.feature46.di

import com.example.feature46.di.module.Feature46ModuleOne
import dagger.Component

@Component(
    modules = [Feature46ModuleOne::class]
)
interface Feature46Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature46Component
    }
}