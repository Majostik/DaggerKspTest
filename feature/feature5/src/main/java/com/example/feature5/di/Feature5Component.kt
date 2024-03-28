package com.example.feature5.di

import com.example.feature5.di.module.Feature5ModuleOne
import dagger.Component

@Component(
    modules = [Feature5ModuleOne::class]
)
interface Feature5Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature5Component
    }
}