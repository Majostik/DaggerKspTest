package com.example.feature22.di

import com.example.feature22.di.module.Feature22ModuleOne
import dagger.Component

@Component(
    modules = [Feature22ModuleOne::class]
)
interface Feature22Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature22Component
    }
}