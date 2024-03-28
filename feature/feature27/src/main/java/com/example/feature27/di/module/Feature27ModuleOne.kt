package com.example.feature27.di.module

import com.example.feature27.feature.Feature27StubEight
import com.example.feature27.feature.Feature27StubEightImpl
import com.example.feature27.feature.Feature27StubFive
import com.example.feature27.feature.Feature27StubFiveImpl
import com.example.feature27.feature.Feature27StubFour
import com.example.feature27.feature.Feature27StubFourImpl
import com.example.feature27.feature.Feature27StubNine
import com.example.feature27.feature.Feature27StubNineImpl
import com.example.feature27.feature.Feature27StubOne
import com.example.feature27.feature.Feature27StubOneImpl
import com.example.feature27.feature.Feature27StubSeven
import com.example.feature27.feature.Feature27StubSevenImpl
import com.example.feature27.feature.Feature27StubSix
import com.example.feature27.feature.Feature27StubSixImpl
import com.example.feature27.feature.Feature27StubTen
import com.example.feature27.feature.Feature27StubTenImpl
import com.example.feature27.feature.Feature27StubThree
import com.example.feature27.feature.Feature27StubThreeImpl
import com.example.feature27.feature.Feature27StubTwo
import com.example.feature27.feature.Feature27StubTwoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface Feature27ModuleOne {

    @Binds
    fun bindsFeature27StubOne(impl: Feature27StubOneImpl): Feature27StubOne

    @Binds
    fun bindsFeature27StubTwo(impl: Feature27StubTwoImpl): Feature27StubTwo

    @Binds
    fun bindsFeature27StubThree(impl: Feature27StubThreeImpl): Feature27StubThree

    @Binds
    fun bindsFeature27StubFour(impl: Feature27StubFourImpl): Feature27StubFour

    @Binds
    fun bindsFeature27StubFive(impl: Feature27StubFiveImpl): Feature27StubFive

    @Binds
    fun bindsFeature27StubSix(impl: Feature27StubSixImpl): Feature27StubSix

    @Binds
    fun bindsFeature27StubSeven(impl: Feature27StubSevenImpl): Feature27StubSeven

    @Binds
    fun bindsFeature27StubEight(impl: Feature27StubEightImpl): Feature27StubEight

    @Binds
    fun bindsFeature27StubNine(impl: Feature27StubNineImpl): Feature27StubNine
    @Binds

    fun bindsFeature27StubTen(impl: Feature27StubTenImpl): Feature27StubTen
}