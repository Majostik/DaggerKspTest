package com.example.feature11.di

import com.example.feature11.di.module.Feature11ModuleOne
import dagger.Component

@Component(
    modules = [Feature11ModuleOne::class]
)
interface Feature11Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature11Component
    }
}