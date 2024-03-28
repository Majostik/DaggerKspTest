package com.example.feature13.di.module

import com.example.feature13.feature.Feature13StubEight
import com.example.feature13.feature.Feature13StubEightImpl
import com.example.feature13.feature.Feature13StubFive
import com.example.feature13.feature.Feature13StubFiveImpl
import com.example.feature13.feature.Feature13StubFour
import com.example.feature13.feature.Feature13StubFourImpl
import com.example.feature13.feature.Feature13StubNine
import com.example.feature13.feature.Feature13StubNineImpl
import com.example.feature13.feature.Feature13StubOne
import com.example.feature13.feature.Feature13StubOneImpl
import com.example.feature13.feature.Feature13StubSeven
import com.example.feature13.feature.Feature13StubSevenImpl
import com.example.feature13.feature.Feature13StubSix
import com.example.feature13.feature.Feature13StubSixImpl
import com.example.feature13.feature.Feature13StubTen
import com.example.feature13.feature.Feature13StubTenImpl
import com.example.feature13.feature.Feature13StubThree
import com.example.feature13.feature.Feature13StubThreeImpl
import com.example.feature13.feature.Feature13StubTwo
import com.example.feature13.feature.Feature13StubTwoImpl
import dagger.Binds
import dagger.Module

@Module
interface Feature13ModuleOne {

    @Binds
    fun bindsFeature13StubOne(impl: Feature13StubOneImpl): Feature13StubOne

    @Binds
    fun bindsFeature13StubTwo(impl: Feature13StubTwoImpl): Feature13StubTwo

    @Binds
    fun bindsFeature13StubThree(impl: Feature13StubThreeImpl): Feature13StubThree

    @Binds
    fun bindsFeature13StubFour(impl: Feature13StubFourImpl): Feature13StubFour

    @Binds
    fun bindsFeature13StubFive(impl: Feature13StubFiveImpl): Feature13StubFive

    @Binds
    fun bindsFeature13StubSix(impl: Feature13StubSixImpl): Feature13StubSix

    @Binds
    fun bindsFeature13StubSeven(impl: Feature13StubSevenImpl): Feature13StubSeven

    @Binds
    fun bindsFeature13StubEight(impl: Feature13StubEightImpl): Feature13StubEight

    @Binds
    fun bindsFeature13StubNine(impl: Feature13StubNineImpl): Feature13StubNine
    @Binds

    fun bindsFeature13StubTen(impl: Feature13StubTenImpl): Feature13StubTen
}