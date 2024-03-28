package com.example.feature7.di

import com.example.feature7.di.module.Feature7ModuleOne
import dagger.Component

@Component(
    modules = [Feature7ModuleOne::class]
)
interface Feature7Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature7Component
    }
}