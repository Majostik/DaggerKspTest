package com.example.testkspproject

import android.app.Application
import com.example.core.ComponentDependenciesProvider
import com.example.core.HasComponentDependencies
import com.example.testkspproject.di.AppComponent
import com.example.testkspproject.di.DaggerAppComponent
import javax.inject.Inject

class App: Application(), HasComponentDependencies {

    private lateinit var appComponent: AppComponent

    @Inject
    override lateinit var dependencies: ComponentDependenciesProvider
        protected set

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent
            .factory()
            .create(this)
        appComponent.inject(this)
    }
}