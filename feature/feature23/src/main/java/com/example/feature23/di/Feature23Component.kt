package com.example.feature23.di

import com.example.feature23.di.module.Feature23ModuleOne
import dagger.Component

@Component(
    modules = [Feature23ModuleOne::class]
)
interface Feature23Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature23Component
    }
}