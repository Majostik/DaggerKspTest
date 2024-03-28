package com.example.feature18.di

import com.example.feature18.di.module.Feature18ModuleOne
import dagger.Component

@Component(
    modules = [Feature18ModuleOne::class]
)
interface Feature18Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature18Component
    }
}