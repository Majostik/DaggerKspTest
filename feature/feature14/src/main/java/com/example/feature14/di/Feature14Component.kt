package com.example.feature14.di

import com.example.feature14.di.module.Feature14ModuleOne
import dagger.Component

@Component(
    modules = [Feature14ModuleOne::class]
)
interface Feature14Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature14Component
    }
}