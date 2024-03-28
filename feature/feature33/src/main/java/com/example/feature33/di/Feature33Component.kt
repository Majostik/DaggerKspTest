package com.example.feature33.di

import com.example.feature33.di.module.Feature33ModuleOne
import dagger.Component

@Component(
    modules = [Feature33ModuleOne::class]
)
interface Feature33Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature33Component
    }
}