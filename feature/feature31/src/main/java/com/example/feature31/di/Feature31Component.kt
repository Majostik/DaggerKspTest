package com.example.feature31.di

import com.example.feature31.di.module.Feature31ModuleOne
import dagger.Component

@Component(
    modules = [Feature31ModuleOne::class]
)
interface Feature31Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature31Component
    }
}