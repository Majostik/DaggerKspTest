package com.example.feature24.di

import com.example.feature24.di.module.Feature24ModuleOne
import dagger.Component

@Component(
    modules = [Feature24ModuleOne::class]
)
interface Feature24Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature24Component
    }
}