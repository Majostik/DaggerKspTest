package com.example.feature34.di

import com.example.feature34.di.module.Feature34ModuleOne
import dagger.Component

@Component(
    modules = [Feature34ModuleOne::class]
)
interface Feature34Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature34Component
    }
}