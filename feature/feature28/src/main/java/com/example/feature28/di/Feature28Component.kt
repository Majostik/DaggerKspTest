package com.example.feature28.di

import com.example.feature28.di.module.Feature28ModuleOne
import dagger.Component

@Component(
    modules = [Feature28ModuleOne::class]
)
interface Feature28Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature28Component
    }
}