package com.example.feature1.di

import android.content.Context
import com.example.core.ComponentDependencies

interface Feature1Dependencies : ComponentDependencies {

    fun context(): Context
}