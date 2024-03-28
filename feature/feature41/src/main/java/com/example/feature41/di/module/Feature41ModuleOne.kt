package com.example.feature41.di.module

import com.example.feature41.feature.Feature41StubEight
import com.example.feature41.feature.Feature41StubEightImpl
import com.example.feature41.feature.Feature41StubFive
import com.example.feature41.feature.Feature41StubFiveImpl
import com.example.feature41.feature.Feature41StubFour
import com.example.feature41.feature.Feature41StubFourImpl
import com.example.feature41.feature.Feature41StubNine
import com.example.feature41.feature.Feature41StubNineImpl
import com.example.feature41.feature.Feature41StubOne
import com.example.feature41.feature.Feature41StubOneImpl
import com.example.feature41.feature.Feature41StubSeven
import com.example.feature41.feature.Feature41StubSevenImpl
import com.example.feature41.feature.Feature41StubSix
import com.example.feature41.feature.Feature41StubSixImpl
import com.example.feature41.feature.Feature41StubTen
import com.example.feature41.feature.Feature41StubTenImpl
import com.example.feature41.feature.Feature41StubThree
import com.example.feature41.feature.Feature41StubThreeImpl
import com.example.feature41.feature.Feature41StubTwo
import com.example.feature41.feature.Feature41StubTwoImpl
import dagger.Binds
import dagger.Module

@Module
interface Feature41ModuleOne {

    @Binds
    fun bindsFeature41StubOne(impl: Feature41StubOneImpl): Feature41StubOne

    @Binds
    fun bindsFeature41StubTwo(impl: Feature41StubTwoImpl): Feature41StubTwo

    @Binds
    fun bindsFeature41StubThree(impl: Feature41StubThreeImpl): Feature41StubThree

    @Binds
    fun bindsFeature41StubFour(impl: Feature41StubFourImpl): Feature41StubFour

    @Binds
    fun bindsFeature41StubFive(impl: Feature41StubFiveImpl): Feature41StubFive

    @Binds
    fun bindsFeature41StubSix(impl: Feature41StubSixImpl): Feature41StubSix

    @Binds
    fun bindsFeature41StubSeven(impl: Feature41StubSevenImpl): Feature41StubSeven

    @Binds
    fun bindsFeature41StubEight(impl: Feature41StubEightImpl): Feature41StubEight

    @Binds
    fun bindsFeature41StubNine(impl: Feature41StubNineImpl): Feature41StubNine
    @Binds

    fun bindsFeature41StubTen(impl: Feature41StubTenImpl): Feature41StubTen
}