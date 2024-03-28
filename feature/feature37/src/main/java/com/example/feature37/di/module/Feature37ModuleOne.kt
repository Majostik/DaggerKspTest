package com.example.feature37.di.module

import com.example.feature37.feature.Feature37StubEight
import com.example.feature37.feature.Feature37StubEightImpl
import com.example.feature37.feature.Feature37StubFive
import com.example.feature37.feature.Feature37StubFiveImpl
import com.example.feature37.feature.Feature37StubFour
import com.example.feature37.feature.Feature37StubFourImpl
import com.example.feature37.feature.Feature37StubNine
import com.example.feature37.feature.Feature37StubNineImpl
import com.example.feature37.feature.Feature37StubOne
import com.example.feature37.feature.Feature37StubOneImpl
import com.example.feature37.feature.Feature37StubSeven
import com.example.feature37.feature.Feature37StubSevenImpl
import com.example.feature37.feature.Feature37StubSix
import com.example.feature37.feature.Feature37StubSixImpl
import com.example.feature37.feature.Feature37StubTen
import com.example.feature37.feature.Feature37StubTenImpl
import com.example.feature37.feature.Feature37StubThree
import com.example.feature37.feature.Feature37StubThreeImpl
import com.example.feature37.feature.Feature37StubTwo
import com.example.feature37.feature.Feature37StubTwoImpl
import dagger.Binds
import dagger.Module

@Module
interface Feature37ModuleOne {

    @Binds
    fun bindsFeature37StubOne(impl: Feature37StubOneImpl): Feature37StubOne

    @Binds
    fun bindsFeature37StubTwo(impl: Feature37StubTwoImpl): Feature37StubTwo

    @Binds
    fun bindsFeature37StubThree(impl: Feature37StubThreeImpl): Feature37StubThree

    @Binds
    fun bindsFeature37StubFour(impl: Feature37StubFourImpl): Feature37StubFour

    @Binds
    fun bindsFeature37StubFive(impl: Feature37StubFiveImpl): Feature37StubFive

    @Binds
    fun bindsFeature37StubSix(impl: Feature37StubSixImpl): Feature37StubSix

    @Binds
    fun bindsFeature37StubSeven(impl: Feature37StubSevenImpl): Feature37StubSeven

    @Binds
    fun bindsFeature37StubEight(impl: Feature37StubEightImpl): Feature37StubEight

    @Binds
    fun bindsFeature37StubNine(impl: Feature37StubNineImpl): Feature37StubNine
    @Binds

    fun bindsFeature37StubTen(impl: Feature37StubTenImpl): Feature37StubTen
}