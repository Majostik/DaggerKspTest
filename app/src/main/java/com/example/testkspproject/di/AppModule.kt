package com.example.testkspproject.di

import android.content.Context
import com.example.testkspproject.App
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
open class AppModule {

    @Provides
    fun provideContext(app: App): Context {
        return app.applicationContext
    }
}