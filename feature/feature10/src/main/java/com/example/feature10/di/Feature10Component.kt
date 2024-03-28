package com.example.feature10.di

import com.example.feature10.di.module.Feature10ModuleOne
import dagger.Component

@Component(
    modules = [Feature10ModuleOne::class]
)
interface Feature10Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature10Component
    }
}