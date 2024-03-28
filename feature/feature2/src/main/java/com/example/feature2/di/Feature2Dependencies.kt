package com.example.feature2.di

import android.content.Context
import com.example.core.ComponentDependencies

interface Feature2Dependencies : ComponentDependencies {

    fun context(): Context
}