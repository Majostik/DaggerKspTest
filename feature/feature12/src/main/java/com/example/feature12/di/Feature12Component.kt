package com.example.feature12.di

import com.example.feature12.di.module.Feature12ModuleOne
import dagger.Component

@Component(
    modules = [Feature12ModuleOne::class]
)
interface Feature12Component {

    @Component.Factory
    interface Factory {

        fun create(): Feature12Component
    }
}