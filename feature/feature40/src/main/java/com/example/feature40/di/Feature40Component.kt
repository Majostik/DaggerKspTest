package com.example.feature40.di

import com.example.feature40.di.module.Feature40ModuleOne
import dagger.Component

@Component(
    modules = [Feature40ModuleOne::class]
)
interface Feature40Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature40Component
    }
}