package com.example.feature48.di.module

import com.example.feature48.feature.Feature48StubEight
import com.example.feature48.feature.Feature48StubEightImpl
import com.example.feature48.feature.Feature48StubFive
import com.example.feature48.feature.Feature48StubFiveImpl
import com.example.feature48.feature.Feature48StubFour
import com.example.feature48.feature.Feature48StubFourImpl
import com.example.feature48.feature.Feature48StubNine
import com.example.feature48.feature.Feature48StubNineImpl
import com.example.feature48.feature.Feature48StubOne
import com.example.feature48.feature.Feature48StubOneImpl
import com.example.feature48.feature.Feature48StubSeven
import com.example.feature48.feature.Feature48StubSevenImpl
import com.example.feature48.feature.Feature48StubSix
import com.example.feature48.feature.Feature48StubSixImpl
import com.example.feature48.feature.Feature48StubTen
import com.example.feature48.feature.Feature48StubTenImpl
import com.example.feature48.feature.Feature48StubThree
import com.example.feature48.feature.Feature48StubThreeImpl
import com.example.feature48.feature.Feature48StubTwo
import com.example.feature48.feature.Feature48StubTwoImpl
import dagger.Binds
import dagger.Module

@Module
interface Feature48ModuleOne {

    @Binds
    fun bindsFeature48StubOne(impl: Feature48StubOneImpl): Feature48StubOne

    @Binds
    fun bindsFeature48StubTwo(impl: Feature48StubTwoImpl): Feature48StubTwo

    @Binds
    fun bindsFeature48StubThree(impl: Feature48StubThreeImpl): Feature48StubThree

    @Binds
    fun bindsFeature48StubFour(impl: Feature48StubFourImpl): Feature48StubFour

    @Binds
    fun bindsFeature48StubFive(impl: Feature48StubFiveImpl): Feature48StubFive

    @Binds
    fun bindsFeature48StubSix(impl: Feature48StubSixImpl): Feature48StubSix

    @Binds
    fun bindsFeature48StubSeven(impl: Feature48StubSevenImpl): Feature48StubSeven

    @Binds
    fun bindsFeature48StubEight(impl: Feature48StubEightImpl): Feature48StubEight

    @Binds
    fun bindsFeature48StubNine(impl: Feature48StubNineImpl): Feature48StubNine
    @Binds

    fun bindsFeature48StubTen(impl: Feature48StubTenImpl): Feature48StubTen
}