package com.example.feature21.di

import com.example.feature21.di.module.Feature21ModuleOne
import dagger.Component

@Component(
    modules = [Feature21ModuleOne::class]
)
interface Feature21Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature21Component
    }
}