package com.example.feature3.di

import android.content.Context
import com.example.core.ComponentDependencies

interface Feature3Dependencies : ComponentDependencies {

    fun context(): Context
}