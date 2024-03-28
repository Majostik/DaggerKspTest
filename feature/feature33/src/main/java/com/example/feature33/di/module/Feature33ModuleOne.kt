package com.example.feature33.di.module

import com.example.feature33.feature.Feature33StubEight
import com.example.feature33.feature.Feature33StubEightImpl
import com.example.feature33.feature.Feature33StubFive
import com.example.feature33.feature.Feature33StubFiveImpl
import com.example.feature33.feature.Feature33StubFour
import com.example.feature33.feature.Feature33StubFourImpl
import com.example.feature33.feature.Feature33StubNine
import com.example.feature33.feature.Feature33StubNineImpl
import com.example.feature33.feature.Feature33StubOne
import com.example.feature33.feature.Feature33StubOneImpl
import com.example.feature33.feature.Feature33StubSeven
import com.example.feature33.feature.Feature33StubSevenImpl
import com.example.feature33.feature.Feature33StubSix
import com.example.feature33.feature.Feature33StubSixImpl
import com.example.feature33.feature.Feature33StubTen
import com.example.feature33.feature.Feature33StubTenImpl
import com.example.feature33.feature.Feature33StubThree
import com.example.feature33.feature.Feature33StubThreeImpl
import com.example.feature33.feature.Feature33StubTwo
import com.example.feature33.feature.Feature33StubTwoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface Feature33ModuleOne {

    @Binds
    fun bindsFeature33StubOne(impl: Feature33StubOneImpl): Feature33StubOne

    @Binds
    fun bindsFeature33StubTwo(impl: Feature33StubTwoImpl): Feature33StubTwo

    @Binds
    fun bindsFeature33StubThree(impl: Feature33StubThreeImpl): Feature33StubThree

    @Binds
    fun bindsFeature33StubFour(impl: Feature33StubFourImpl): Feature33StubFour

    @Binds
    fun bindsFeature33StubFive(impl: Feature33StubFiveImpl): Feature33StubFive

    @Binds
    fun bindsFeature33StubSix(impl: Feature33StubSixImpl): Feature33StubSix

    @Binds
    fun bindsFeature33StubSeven(impl: Feature33StubSevenImpl): Feature33StubSeven

    @Binds
    fun bindsFeature33StubEight(impl: Feature33StubEightImpl): Feature33StubEight

    @Binds
    fun bindsFeature33StubNine(impl: Feature33StubNineImpl): Feature33StubNine
    @Binds

    fun bindsFeature33StubTen(impl: Feature33StubTenImpl): Feature33StubTen
}