package com.example.feature36.di.module

import com.example.feature36.feature.Feature36StubEight
import com.example.feature36.feature.Feature36StubEightImpl
import com.example.feature36.feature.Feature36StubFive
import com.example.feature36.feature.Feature36StubFiveImpl
import com.example.feature36.feature.Feature36StubFour
import com.example.feature36.feature.Feature36StubFourImpl
import com.example.feature36.feature.Feature36StubNine
import com.example.feature36.feature.Feature36StubNineImpl
import com.example.feature36.feature.Feature36StubOne
import com.example.feature36.feature.Feature36StubOneImpl
import com.example.feature36.feature.Feature36StubSeven
import com.example.feature36.feature.Feature36StubSevenImpl
import com.example.feature36.feature.Feature36StubSix
import com.example.feature36.feature.Feature36StubSixImpl
import com.example.feature36.feature.Feature36StubTen
import com.example.feature36.feature.Feature36StubTenImpl
import com.example.feature36.feature.Feature36StubThree
import com.example.feature36.feature.Feature36StubThreeImpl
import com.example.feature36.feature.Feature36StubTwo
import com.example.feature36.feature.Feature36StubTwoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface Feature36ModuleOne {

    @Binds
    fun bindsFeature36StubOne(impl: Feature36StubOneImpl): Feature36StubOne

    @Binds
    fun bindsFeature36StubTwo(impl: Feature36StubTwoImpl): Feature36StubTwo

    @Binds
    fun bindsFeature36StubThree(impl: Feature36StubThreeImpl): Feature36StubThree

    @Binds
    fun bindsFeature36StubFour(impl: Feature36StubFourImpl): Feature36StubFour

    @Binds
    fun bindsFeature36StubFive(impl: Feature36StubFiveImpl): Feature36StubFive

    @Binds
    fun bindsFeature36StubSix(impl: Feature36StubSixImpl): Feature36StubSix

    @Binds
    fun bindsFeature36StubSeven(impl: Feature36StubSevenImpl): Feature36StubSeven

    @Binds
    fun bindsFeature36StubEight(impl: Feature36StubEightImpl): Feature36StubEight

    @Binds
    fun bindsFeature36StubNine(impl: Feature36StubNineImpl): Feature36StubNine
    @Binds

    fun bindsFeature36StubTen(impl: Feature36StubTenImpl): Feature36StubTen
}