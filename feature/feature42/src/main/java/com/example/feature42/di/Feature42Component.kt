package com.example.feature42.di

import com.example.feature42.di.module.Feature42ModuleOne
import dagger.Component

@Component(
    modules = [Feature42ModuleOne::class]
)
interface Feature42Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature42Component
    }
}