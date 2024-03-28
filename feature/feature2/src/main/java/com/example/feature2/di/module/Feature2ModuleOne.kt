package com.example.feature2.di.module

import com.example.feature2.feature.Feature2StubEight
import com.example.feature2.feature.Feature2StubEightImpl
import com.example.feature2.feature.Feature2StubFive
import com.example.feature2.feature.Feature2StubFiveImpl
import com.example.feature2.feature.Feature2StubFour
import com.example.feature2.feature.Feature2StubFourImpl
import com.example.feature2.feature.Feature2StubNine
import com.example.feature2.feature.Feature2StubNineImpl
import com.example.feature2.feature.Feature2StubOne
import com.example.feature2.feature.Feature2StubOneImpl
import com.example.feature2.feature.Feature2StubSeven
import com.example.feature2.feature.Feature2StubSevenImpl
import com.example.feature2.feature.Feature2StubSix
import com.example.feature2.feature.Feature2StubSixImpl
import com.example.feature2.feature.Feature2StubTen
import com.example.feature2.feature.Feature2StubTenImpl
import com.example.feature2.feature.Feature2StubThree
import com.example.feature2.feature.Feature2StubThreeImpl
import com.example.feature2.feature.Feature2StubTwo
import com.example.feature2.feature.Feature2StubTwoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface Feature2ModuleOne {

    @Binds
    fun bindsFeature2StubOne(impl: Feature2StubOneImpl): Feature2StubOne

    @Binds
    fun bindsFeature2StubTwo(impl: Feature2StubTwoImpl): Feature2StubTwo

    @Binds
    fun bindsFeature2StubThree(impl: Feature2StubThreeImpl): Feature2StubThree

    @Binds
    fun bindsFeature2StubFour(impl: Feature2StubFourImpl): Feature2StubFour

    @Binds
    fun bindsFeature2StubFive(impl: Feature2StubFiveImpl): Feature2StubFive

    @Binds
    fun bindsFeature2StubSix(impl: Feature2StubSixImpl): Feature2StubSix

    @Binds
    fun bindsFeature2StubSeven(impl: Feature2StubSevenImpl): Feature2StubSeven

    @Binds
    fun bindsFeature2StubEight(impl: Feature2StubEightImpl): Feature2StubEight

    @Binds
    fun bindsFeature2StubNine(impl: Feature2StubNineImpl): Feature2StubNine
    @Binds

    fun bindsFeature2StubTen(impl: Feature2StubTenImpl): Feature2StubTen
}