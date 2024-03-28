package com.example.feature_1.di

import com.example.feature_1.di.module.Feature2ModuleOne
import dagger.Component

@Component(
    modules = [Feature2ModuleOne::class]
)
interface Feature2Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature2Component
    }
}