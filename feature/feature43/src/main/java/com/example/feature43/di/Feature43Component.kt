package com.example.feature43.di

import com.example.feature43.di.module.Feature43ModuleOne
import dagger.Component

@Component(
    modules = [Feature43ModuleOne::class]
)
interface Feature43Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature43Component
    }
}