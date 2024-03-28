package com.example.feature21.di.module

import com.example.feature21.feature.Feature21StubEight
import com.example.feature21.feature.Feature21StubEightImpl
import com.example.feature21.feature.Feature21StubFive
import com.example.feature21.feature.Feature21StubFiveImpl
import com.example.feature21.feature.Feature21StubFour
import com.example.feature21.feature.Feature21StubFourImpl
import com.example.feature21.feature.Feature21StubNine
import com.example.feature21.feature.Feature21StubNineImpl
import com.example.feature21.feature.Feature21StubOne
import com.example.feature21.feature.Feature21StubOneImpl
import com.example.feature21.feature.Feature21StubSeven
import com.example.feature21.feature.Feature21StubSevenImpl
import com.example.feature21.feature.Feature21StubSix
import com.example.feature21.feature.Feature21StubSixImpl
import com.example.feature21.feature.Feature21StubTen
import com.example.feature21.feature.Feature21StubTenImpl
import com.example.feature21.feature.Feature21StubThree
import com.example.feature21.feature.Feature21StubThreeImpl
import com.example.feature21.feature.Feature21StubTwo
import com.example.feature21.feature.Feature21StubTwoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface Feature21ModuleOne {

    @Binds
    fun bindsFeature21StubOne(impl: Feature21StubOneImpl): Feature21StubOne

    @Binds
    fun bindsFeature21StubTwo(impl: Feature21StubTwoImpl): Feature21StubTwo

    @Binds
    fun bindsFeature21StubThree(impl: Feature21StubThreeImpl): Feature21StubThree

    @Binds
    fun bindsFeature21StubFour(impl: Feature21StubFourImpl): Feature21StubFour

    @Binds
    fun bindsFeature21StubFive(impl: Feature21StubFiveImpl): Feature21StubFive

    @Binds
    fun bindsFeature21StubSix(impl: Feature21StubSixImpl): Feature21StubSix

    @Binds
    fun bindsFeature21StubSeven(impl: Feature21StubSevenImpl): Feature21StubSeven

    @Binds
    fun bindsFeature21StubEight(impl: Feature21StubEightImpl): Feature21StubEight

    @Binds
    fun bindsFeature21StubNine(impl: Feature21StubNineImpl): Feature21StubNine
    @Binds

    fun bindsFeature21StubTen(impl: Feature21StubTenImpl): Feature21StubTen
}