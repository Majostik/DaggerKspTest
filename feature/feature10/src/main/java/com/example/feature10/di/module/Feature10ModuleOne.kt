package com.example.feature10.di.module

import com.example.feature10.feature.Feature10StubEight
import com.example.feature10.feature.Feature10StubEightImpl
import com.example.feature10.feature.Feature10StubFive
import com.example.feature10.feature.Feature10StubFiveImpl
import com.example.feature10.feature.Feature10StubFour
import com.example.feature10.feature.Feature10StubFourImpl
import com.example.feature10.feature.Feature10StubNine
import com.example.feature10.feature.Feature10StubNineImpl
import com.example.feature10.feature.Feature10StubOne
import com.example.feature10.feature.Feature10StubOneImpl
import com.example.feature10.feature.Feature10StubSeven
import com.example.feature10.feature.Feature10StubSevenImpl
import com.example.feature10.feature.Feature10StubSix
import com.example.feature10.feature.Feature10StubSixImpl
import com.example.feature10.feature.Feature10StubTen
import com.example.feature10.feature.Feature10StubTenImpl
import com.example.feature10.feature.Feature10StubThree
import com.example.feature10.feature.Feature10StubThreeImpl
import com.example.feature10.feature.Feature10StubTwo
import com.example.feature10.feature.Feature10StubTwoImpl
import dagger.Binds
import dagger.Module

@Module
interface Feature10ModuleOne {

    @Binds
    fun bindsFeature10StubOne(impl: Feature10StubOneImpl): Feature10StubOne

    @Binds
    fun bindsFeature10StubTwo(impl: Feature10StubTwoImpl): Feature10StubTwo

    @Binds
    fun bindsFeature10StubThree(impl: Feature10StubThreeImpl): Feature10StubThree

    @Binds
    fun bindsFeature10StubFour(impl: Feature10StubFourImpl): Feature10StubFour

    @Binds
    fun bindsFeature10StubFive(impl: Feature10StubFiveImpl): Feature10StubFive

    @Binds
    fun bindsFeature10StubSix(impl: Feature10StubSixImpl): Feature10StubSix

    @Binds
    fun bindsFeature10StubSeven(impl: Feature10StubSevenImpl): Feature10StubSeven

    @Binds
    fun bindsFeature10StubEight(impl: Feature10StubEightImpl): Feature10StubEight

    @Binds
    fun bindsFeature10StubNine(impl: Feature10StubNineImpl): Feature10StubNine
    @Binds

    fun bindsFeature10StubTen(impl: Feature10StubTenImpl): Feature10StubTen
}