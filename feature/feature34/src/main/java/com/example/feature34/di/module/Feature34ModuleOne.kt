package com.example.feature34.di.module

import com.example.feature34.feature.Feature34StubEight
import com.example.feature34.feature.Feature34StubEightImpl
import com.example.feature34.feature.Feature34StubFive
import com.example.feature34.feature.Feature34StubFiveImpl
import com.example.feature34.feature.Feature34StubFour
import com.example.feature34.feature.Feature34StubFourImpl
import com.example.feature34.feature.Feature34StubNine
import com.example.feature34.feature.Feature34StubNineImpl
import com.example.feature34.feature.Feature34StubOne
import com.example.feature34.feature.Feature34StubOneImpl
import com.example.feature34.feature.Feature34StubSeven
import com.example.feature34.feature.Feature34StubSevenImpl
import com.example.feature34.feature.Feature34StubSix
import com.example.feature34.feature.Feature34StubSixImpl
import com.example.feature34.feature.Feature34StubTen
import com.example.feature34.feature.Feature34StubTenImpl
import com.example.feature34.feature.Feature34StubThree
import com.example.feature34.feature.Feature34StubThreeImpl
import com.example.feature34.feature.Feature34StubTwo
import com.example.feature34.feature.Feature34StubTwoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface Feature34ModuleOne {

    @Binds
    fun bindsFeature34StubOne(impl: Feature34StubOneImpl): Feature34StubOne

    @Binds
    fun bindsFeature34StubTwo(impl: Feature34StubTwoImpl): Feature34StubTwo

    @Binds
    fun bindsFeature34StubThree(impl: Feature34StubThreeImpl): Feature34StubThree

    @Binds
    fun bindsFeature34StubFour(impl: Feature34StubFourImpl): Feature34StubFour

    @Binds
    fun bindsFeature34StubFive(impl: Feature34StubFiveImpl): Feature34StubFive

    @Binds
    fun bindsFeature34StubSix(impl: Feature34StubSixImpl): Feature34StubSix

    @Binds
    fun bindsFeature34StubSeven(impl: Feature34StubSevenImpl): Feature34StubSeven

    @Binds
    fun bindsFeature34StubEight(impl: Feature34StubEightImpl): Feature34StubEight

    @Binds
    fun bindsFeature34StubNine(impl: Feature34StubNineImpl): Feature34StubNine
    @Binds

    fun bindsFeature34StubTen(impl: Feature34StubTenImpl): Feature34StubTen
}