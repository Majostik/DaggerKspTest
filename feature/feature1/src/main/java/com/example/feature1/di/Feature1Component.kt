package com.example.feature1.di

import com.example.feature1.di.module.Feature1ModuleOne
import dagger.Component

@Component(
    modules = [Feature1ModuleOne::class]
)
interface Feature1Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature1Component
    }
}