package com.example.feature36.di

import com.example.feature36.di.module.Feature36ModuleOne
import dagger.Component

@Component(
    modules = [Feature36ModuleOne::class]
)
interface Feature36Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature36Component
    }
}