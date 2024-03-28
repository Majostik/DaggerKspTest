package com.example.feature3.di

import com.example.feature3.di.module.Feature3ModuleOne
import dagger.Component

@Component(
    modules = [Feature3ModuleOne::class]
)
interface Feature3Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature3Component
    }
}