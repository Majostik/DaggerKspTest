package com.example.feature29.di

import com.example.feature29.di.module.Feature29ModuleOne
import dagger.Component

@Component(
    modules = [Feature29ModuleOne::class]
)
interface Feature29Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature29Component
    }
}