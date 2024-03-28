package com.example.feature24.di.module

import com.example.feature24.feature.Feature24StubEight
import com.example.feature24.feature.Feature24StubEightImpl
import com.example.feature24.feature.Feature24StubFive
import com.example.feature24.feature.Feature24StubFiveImpl
import com.example.feature24.feature.Feature24StubFour
import com.example.feature24.feature.Feature24StubFourImpl
import com.example.feature24.feature.Feature24StubNine
import com.example.feature24.feature.Feature24StubNineImpl
import com.example.feature24.feature.Feature24StubOne
import com.example.feature24.feature.Feature24StubOneImpl
import com.example.feature24.feature.Feature24StubSeven
import com.example.feature24.feature.Feature24StubSevenImpl
import com.example.feature24.feature.Feature24StubSix
import com.example.feature24.feature.Feature24StubSixImpl
import com.example.feature24.feature.Feature24StubTen
import com.example.feature24.feature.Feature24StubTenImpl
import com.example.feature24.feature.Feature24StubThree
import com.example.feature24.feature.Feature24StubThreeImpl
import com.example.feature24.feature.Feature24StubTwo
import com.example.feature24.feature.Feature24StubTwoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface Feature24ModuleOne {

    @Binds
    fun bindsFeature24StubOne(impl: Feature24StubOneImpl): Feature24StubOne

    @Binds
    fun bindsFeature24StubTwo(impl: Feature24StubTwoImpl): Feature24StubTwo

    @Binds
    fun bindsFeature24StubThree(impl: Feature24StubThreeImpl): Feature24StubThree

    @Binds
    fun bindsFeature24StubFour(impl: Feature24StubFourImpl): Feature24StubFour

    @Binds
    fun bindsFeature24StubFive(impl: Feature24StubFiveImpl): Feature24StubFive

    @Binds
    fun bindsFeature24StubSix(impl: Feature24StubSixImpl): Feature24StubSix

    @Binds
    fun bindsFeature24StubSeven(impl: Feature24StubSevenImpl): Feature24StubSeven

    @Binds
    fun bindsFeature24StubEight(impl: Feature24StubEightImpl): Feature24StubEight

    @Binds
    fun bindsFeature24StubNine(impl: Feature24StubNineImpl): Feature24StubNine
    @Binds

    fun bindsFeature24StubTen(impl: Feature24StubTenImpl): Feature24StubTen
}