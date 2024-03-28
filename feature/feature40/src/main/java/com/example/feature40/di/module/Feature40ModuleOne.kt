package com.example.feature40.di.module

import com.example.feature40.feature.Feature40StubEight
import com.example.feature40.feature.Feature40StubEightImpl
import com.example.feature40.feature.Feature40StubFive
import com.example.feature40.feature.Feature40StubFiveImpl
import com.example.feature40.feature.Feature40StubFour
import com.example.feature40.feature.Feature40StubFourImpl
import com.example.feature40.feature.Feature40StubNine
import com.example.feature40.feature.Feature40StubNineImpl
import com.example.feature40.feature.Feature40StubOne
import com.example.feature40.feature.Feature40StubOneImpl
import com.example.feature40.feature.Feature40StubSeven
import com.example.feature40.feature.Feature40StubSevenImpl
import com.example.feature40.feature.Feature40StubSix
import com.example.feature40.feature.Feature40StubSixImpl
import com.example.feature40.feature.Feature40StubTen
import com.example.feature40.feature.Feature40StubTenImpl
import com.example.feature40.feature.Feature40StubThree
import com.example.feature40.feature.Feature40StubThreeImpl
import com.example.feature40.feature.Feature40StubTwo
import com.example.feature40.feature.Feature40StubTwoImpl
import dagger.Binds
import dagger.Module

@Module
interface Feature40ModuleOne {

    @Binds
    fun bindsFeature40StubOne(impl: Feature40StubOneImpl): Feature40StubOne

    @Binds
    fun bindsFeature40StubTwo(impl: Feature40StubTwoImpl): Feature40StubTwo

    @Binds
    fun bindsFeature40StubThree(impl: Feature40StubThreeImpl): Feature40StubThree

    @Binds
    fun bindsFeature40StubFour(impl: Feature40StubFourImpl): Feature40StubFour

    @Binds
    fun bindsFeature40StubFive(impl: Feature40StubFiveImpl): Feature40StubFive

    @Binds
    fun bindsFeature40StubSix(impl: Feature40StubSixImpl): Feature40StubSix

    @Binds
    fun bindsFeature40StubSeven(impl: Feature40StubSevenImpl): Feature40StubSeven

    @Binds
    fun bindsFeature40StubEight(impl: Feature40StubEightImpl): Feature40StubEight

    @Binds
    fun bindsFeature40StubNine(impl: Feature40StubNineImpl): Feature40StubNine
    @Binds

    fun bindsFeature40StubTen(impl: Feature40StubTenImpl): Feature40StubTen
}