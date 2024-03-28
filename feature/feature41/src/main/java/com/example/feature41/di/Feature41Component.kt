package com.example.feature41.di

import com.example.feature41.di.module.Feature41ModuleOne
import dagger.Component

@Component(
    modules = [Feature41ModuleOne::class]
)
interface Feature41Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature41Component
    }
}