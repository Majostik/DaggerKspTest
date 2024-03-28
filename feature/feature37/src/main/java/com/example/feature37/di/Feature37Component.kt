package com.example.feature37.di

import com.example.feature37.di.module.Feature37ModuleOne
import dagger.Component

@Component(
    modules = [Feature37ModuleOne::class]
)
interface Feature37Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature37Component
    }
}