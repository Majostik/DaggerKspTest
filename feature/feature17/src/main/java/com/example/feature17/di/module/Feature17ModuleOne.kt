package com.example.feature17.di.module

import com.example.feature17.feature.Feature17StubEight
import com.example.feature17.feature.Feature17StubEightImpl
import com.example.feature17.feature.Feature17StubFive
import com.example.feature17.feature.Feature17StubFiveImpl
import com.example.feature17.feature.Feature17StubFour
import com.example.feature17.feature.Feature17StubFourImpl
import com.example.feature17.feature.Feature17StubNine
import com.example.feature17.feature.Feature17StubNineImpl
import com.example.feature17.feature.Feature17StubOne
import com.example.feature17.feature.Feature17StubOneImpl
import com.example.feature17.feature.Feature17StubSeven
import com.example.feature17.feature.Feature17StubSevenImpl
import com.example.feature17.feature.Feature17StubSix
import com.example.feature17.feature.Feature17StubSixImpl
import com.example.feature17.feature.Feature17StubTen
import com.example.feature17.feature.Feature17StubTenImpl
import com.example.feature17.feature.Feature17StubThree
import com.example.feature17.feature.Feature17StubThreeImpl
import com.example.feature17.feature.Feature17StubTwo
import com.example.feature17.feature.Feature17StubTwoImpl
import dagger.Binds
import dagger.Module

@Module
interface Feature17ModuleOne {

    @Binds
    fun bindsFeature17StubOne(impl: Feature17StubOneImpl): Feature17StubOne

    @Binds
    fun bindsFeature17StubTwo(impl: Feature17StubTwoImpl): Feature17StubTwo

    @Binds
    fun bindsFeature17StubThree(impl: Feature17StubThreeImpl): Feature17StubThree

    @Binds
    fun bindsFeature17StubFour(impl: Feature17StubFourImpl): Feature17StubFour

    @Binds
    fun bindsFeature17StubFive(impl: Feature17StubFiveImpl): Feature17StubFive

    @Binds
    fun bindsFeature17StubSix(impl: Feature17StubSixImpl): Feature17StubSix

    @Binds
    fun bindsFeature17StubSeven(impl: Feature17StubSevenImpl): Feature17StubSeven

    @Binds
    fun bindsFeature17StubEight(impl: Feature17StubEightImpl): Feature17StubEight

    @Binds
    fun bindsFeature17StubNine(impl: Feature17StubNineImpl): Feature17StubNine
    @Binds

    fun bindsFeature17StubTen(impl: Feature17StubTenImpl): Feature17StubTen
}