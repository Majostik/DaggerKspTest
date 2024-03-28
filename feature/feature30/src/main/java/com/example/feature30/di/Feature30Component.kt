package com.example.feature30.di

import com.example.feature30.di.module.Feature30ModuleOne
import dagger.Component

@Component(
    modules = [Feature30ModuleOne::class]
)
interface Feature30Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature30Component
    }
}