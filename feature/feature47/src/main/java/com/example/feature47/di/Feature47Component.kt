package com.example.feature47.di

import com.example.feature47.di.module.Feature47ModuleOne
import dagger.Component

@Component(
    modules = [Feature47ModuleOne::class]
)
interface Feature47Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature47Component
    }
}