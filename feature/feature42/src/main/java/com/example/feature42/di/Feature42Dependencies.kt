package com.example.feature42.di

import android.content.Context
import com.example.core.ComponentDependencies

interface Feature42Dependencies : ComponentDependencies {

    fun context(): Context
}