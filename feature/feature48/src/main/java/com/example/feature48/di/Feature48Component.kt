package com.example.feature48.di

import com.example.feature48.di.module.Feature48ModuleOne
import dagger.Component

@Component(
    modules = [Feature48ModuleOne::class]
)
interface Feature48Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature48Component
    }
}