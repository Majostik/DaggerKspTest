package com.example.feature11.di.module

import com.example.feature11.feature.Feature11StubEight
import com.example.feature11.feature.Feature11StubEightImpl
import com.example.feature11.feature.Feature11StubFive
import com.example.feature11.feature.Feature11StubFiveImpl
import com.example.feature11.feature.Feature11StubFour
import com.example.feature11.feature.Feature11StubFourImpl
import com.example.feature11.feature.Feature11StubNine
import com.example.feature11.feature.Feature11StubNineImpl
import com.example.feature11.feature.Feature11StubOne
import com.example.feature11.feature.Feature11StubOneImpl
import com.example.feature11.feature.Feature11StubSeven
import com.example.feature11.feature.Feature11StubSevenImpl
import com.example.feature11.feature.Feature11StubSix
import com.example.feature11.feature.Feature11StubSixImpl
import com.example.feature11.feature.Feature11StubTen
import com.example.feature11.feature.Feature11StubTenImpl
import com.example.feature11.feature.Feature11StubThree
import com.example.feature11.feature.Feature11StubThreeImpl
import com.example.feature11.feature.Feature11StubTwo
import com.example.feature11.feature.Feature11StubTwoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface Feature11ModuleOne {

    @Binds
    fun bindsFeature11StubOne(impl: Feature11StubOneImpl): Feature11StubOne

    @Binds
    fun bindsFeature11StubTwo(impl: Feature11StubTwoImpl): Feature11StubTwo

    @Binds
    fun bindsFeature11StubThree(impl: Feature11StubThreeImpl): Feature11StubThree

    @Binds
    fun bindsFeature11StubFour(impl: Feature11StubFourImpl): Feature11StubFour

    @Binds
    fun bindsFeature11StubFive(impl: Feature11StubFiveImpl): Feature11StubFive

    @Binds
    fun bindsFeature11StubSix(impl: Feature11StubSixImpl): Feature11StubSix

    @Binds
    fun bindsFeature11StubSeven(impl: Feature11StubSevenImpl): Feature11StubSeven

    @Binds
    fun bindsFeature11StubEight(impl: Feature11StubEightImpl): Feature11StubEight

    @Binds
    fun bindsFeature11StubNine(impl: Feature11StubNineImpl): Feature11StubNine
    @Binds

    fun bindsFeature11StubTen(impl: Feature11StubTenImpl): Feature11StubTen
}