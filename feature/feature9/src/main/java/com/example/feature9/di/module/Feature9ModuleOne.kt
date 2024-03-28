package com.example.feature9.di.module

import com.example.feature9.feature.Feature9StubEight
import com.example.feature9.feature.Feature9StubEightImpl
import com.example.feature9.feature.Feature9StubFive
import com.example.feature9.feature.Feature9StubFiveImpl
import com.example.feature9.feature.Feature9StubFour
import com.example.feature9.feature.Feature9StubFourImpl
import com.example.feature9.feature.Feature9StubNine
import com.example.feature9.feature.Feature9StubNineImpl
import com.example.feature9.feature.Feature9StubOne
import com.example.feature9.feature.Feature9StubOneImpl
import com.example.feature9.feature.Feature9StubSeven
import com.example.feature9.feature.Feature9StubSevenImpl
import com.example.feature9.feature.Feature9StubSix
import com.example.feature9.feature.Feature9StubSixImpl
import com.example.feature9.feature.Feature9StubTen
import com.example.feature9.feature.Feature9StubTenImpl
import com.example.feature9.feature.Feature9StubThree
import com.example.feature9.feature.Feature9StubThreeImpl
import com.example.feature9.feature.Feature9StubTwo
import com.example.feature9.feature.Feature9StubTwoImpl
import dagger.Binds
import dagger.Module

@Module
interface Feature9ModuleOne {

    @Binds
    fun bindsFeature9StubOne(impl: Feature9StubOneImpl): Feature9StubOne

    @Binds
    fun bindsFeature9StubTwo(impl: Feature9StubTwoImpl): Feature9StubTwo

    @Binds
    fun bindsFeature9StubThree(impl: Feature9StubThreeImpl): Feature9StubThree

    @Binds
    fun bindsFeature9StubFour(impl: Feature9StubFourImpl): Feature9StubFour

    @Binds
    fun bindsFeature9StubFive(impl: Feature9StubFiveImpl): Feature9StubFive

    @Binds
    fun bindsFeature9StubSix(impl: Feature9StubSixImpl): Feature9StubSix

    @Binds
    fun bindsFeature9StubSeven(impl: Feature9StubSevenImpl): Feature9StubSeven

    @Binds
    fun bindsFeature9StubEight(impl: Feature9StubEightImpl): Feature9StubEight

    @Binds
    fun bindsFeature9StubNine(impl: Feature9StubNineImpl): Feature9StubNine
    @Binds

    fun bindsFeature9StubTen(impl: Feature9StubTenImpl): Feature9StubTen
}