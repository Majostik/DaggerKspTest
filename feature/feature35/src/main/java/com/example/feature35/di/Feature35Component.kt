package com.example.feature35.di

import com.example.feature35.di.module.Feature35ModuleOne
import dagger.Component

@Component(
    modules = [Feature35ModuleOne::class]
)
interface Feature35Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature35Component
    }
}