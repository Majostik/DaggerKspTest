package com.example.feature19.di

import com.example.feature19.di.module.Feature19ModuleOne
import dagger.Component

@Component(
    modules = [Feature19ModuleOne::class]
)
interface Feature19Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature19Component
    }
}