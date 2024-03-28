package com.example.feature26.di

import com.example.feature26.di.module.Feature26ModuleOne
import dagger.Component

@Component(
    modules = [Feature26ModuleOne::class]
)
interface Feature26Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature26Component
    }
}