package com.example.feature16.di

import com.example.feature16.di.module.Feature16ModuleOne
import dagger.Component

@Component(
    modules = [Feature16ModuleOne::class]
)
interface Feature16Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature16Component
    }
}