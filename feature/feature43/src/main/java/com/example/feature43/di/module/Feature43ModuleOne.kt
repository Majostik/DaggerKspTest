package com.example.feature43.di.module

import com.example.feature43.feature.Feature43StubEight
import com.example.feature43.feature.Feature43StubEightImpl
import com.example.feature43.feature.Feature43StubFive
import com.example.feature43.feature.Feature43StubFiveImpl
import com.example.feature43.feature.Feature43StubFour
import com.example.feature43.feature.Feature43StubFourImpl
import com.example.feature43.feature.Feature43StubNine
import com.example.feature43.feature.Feature43StubNineImpl
import com.example.feature43.feature.Feature43StubOne
import com.example.feature43.feature.Feature43StubOneImpl
import com.example.feature43.feature.Feature43StubSeven
import com.example.feature43.feature.Feature43StubSevenImpl
import com.example.feature43.feature.Feature43StubSix
import com.example.feature43.feature.Feature43StubSixImpl
import com.example.feature43.feature.Feature43StubTen
import com.example.feature43.feature.Feature43StubTenImpl
import com.example.feature43.feature.Feature43StubThree
import com.example.feature43.feature.Feature43StubThreeImpl
import com.example.feature43.feature.Feature43StubTwo
import com.example.feature43.feature.Feature43StubTwoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface Feature43ModuleOne {

    @Binds
    fun bindsFeature43StubOne(impl: Feature43StubOneImpl): Feature43StubOne

    @Binds
    fun bindsFeature43StubTwo(impl: Feature43StubTwoImpl): Feature43StubTwo

    @Binds
    fun bindsFeature43StubThree(impl: Feature43StubThreeImpl): Feature43StubThree

    @Binds
    fun bindsFeature43StubFour(impl: Feature43StubFourImpl): Feature43StubFour

    @Binds
    fun bindsFeature43StubFive(impl: Feature43StubFiveImpl): Feature43StubFive

    @Binds
    fun bindsFeature43StubSix(impl: Feature43StubSixImpl): Feature43StubSix

    @Binds
    fun bindsFeature43StubSeven(impl: Feature43StubSevenImpl): Feature43StubSeven

    @Binds
    fun bindsFeature43StubEight(impl: Feature43StubEightImpl): Feature43StubEight

    @Binds
    fun bindsFeature43StubNine(impl: Feature43StubNineImpl): Feature43StubNine
    @Binds

    fun bindsFeature43StubTen(impl: Feature43StubTenImpl): Feature43StubTen
}