package com.example.feature32.di

import com.example.feature32.di.module.Feature32ModuleOne
import dagger.Component

@Component(
    modules = [Feature32ModuleOne::class]
)
interface Feature32Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature32Component
    }
}