package com.example.feature42.di.module

import com.example.feature42.feature.Feature42StubEight
import com.example.feature42.feature.Feature42StubEightImpl
import com.example.feature42.feature.Feature42StubFive
import com.example.feature42.feature.Feature42StubFiveImpl
import com.example.feature42.feature.Feature42StubFour
import com.example.feature42.feature.Feature42StubFourImpl
import com.example.feature42.feature.Feature42StubNine
import com.example.feature42.feature.Feature42StubNineImpl
import com.example.feature42.feature.Feature42StubOne
import com.example.feature42.feature.Feature42StubOneImpl
import com.example.feature42.feature.Feature42StubSeven
import com.example.feature42.feature.Feature42StubSevenImpl
import com.example.feature42.feature.Feature42StubSix
import com.example.feature42.feature.Feature42StubSixImpl
import com.example.feature42.feature.Feature42StubTen
import com.example.feature42.feature.Feature42StubTenImpl
import com.example.feature42.feature.Feature42StubThree
import com.example.feature42.feature.Feature42StubThreeImpl
import com.example.feature42.feature.Feature42StubTwo
import com.example.feature42.feature.Feature42StubTwoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface Feature42ModuleOne {

    @Binds
    fun bindsFeature42StubOne(impl: Feature42StubOneImpl): Feature42StubOne

    @Binds
    fun bindsFeature42StubTwo(impl: Feature42StubTwoImpl): Feature42StubTwo

    @Binds
    fun bindsFeature42StubThree(impl: Feature42StubThreeImpl): Feature42StubThree

    @Binds
    fun bindsFeature42StubFour(impl: Feature42StubFourImpl): Feature42StubFour

    @Binds
    fun bindsFeature42StubFive(impl: Feature42StubFiveImpl): Feature42StubFive

    @Binds
    fun bindsFeature42StubSix(impl: Feature42StubSixImpl): Feature42StubSix

    @Binds
    fun bindsFeature42StubSeven(impl: Feature42StubSevenImpl): Feature42StubSeven

    @Binds
    fun bindsFeature42StubEight(impl: Feature42StubEightImpl): Feature42StubEight

    @Binds
    fun bindsFeature42StubNine(impl: Feature42StubNineImpl): Feature42StubNine
    @Binds

    fun bindsFeature42StubTen(impl: Feature42StubTenImpl): Feature42StubTen
}