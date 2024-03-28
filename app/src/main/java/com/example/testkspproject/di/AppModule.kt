package com.example.testkspproject.di

import android.content.Context
import com.example.testkspproject.App
import dagger.Module
import dagger.Provides

@Module
open class AppModule {

    @Provides
    fun provideContext(app: App): Context {
        return app.applicationContext
    }
}