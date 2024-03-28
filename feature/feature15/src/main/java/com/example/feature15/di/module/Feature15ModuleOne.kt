package com.example.feature15.di.module

import com.example.feature15.feature.Feature15StubEight
import com.example.feature15.feature.Feature15StubEightImpl
import com.example.feature15.feature.Feature15StubFive
import com.example.feature15.feature.Feature15StubFiveImpl
import com.example.feature15.feature.Feature15StubFour
import com.example.feature15.feature.Feature15StubFourImpl
import com.example.feature15.feature.Feature15StubNine
import com.example.feature15.feature.Feature15StubNineImpl
import com.example.feature15.feature.Feature15StubOne
import com.example.feature15.feature.Feature15StubOneImpl
import com.example.feature15.feature.Feature15StubSeven
import com.example.feature15.feature.Feature15StubSevenImpl
import com.example.feature15.feature.Feature15StubSix
import com.example.feature15.feature.Feature15StubSixImpl
import com.example.feature15.feature.Feature15StubTen
import com.example.feature15.feature.Feature15StubTenImpl
import com.example.feature15.feature.Feature15StubThree
import com.example.feature15.feature.Feature15StubThreeImpl
import com.example.feature15.feature.Feature15StubTwo
import com.example.feature15.feature.Feature15StubTwoImpl
import dagger.Binds
import dagger.Module

@Module
interface Feature15ModuleOne {

    @Binds
    fun bindsFeature15StubOne(impl: Feature15StubOneImpl): Feature15StubOne

    @Binds
    fun bindsFeature15StubTwo(impl: Feature15StubTwoImpl): Feature15StubTwo

    @Binds
    fun bindsFeature15StubThree(impl: Feature15StubThreeImpl): Feature15StubThree

    @Binds
    fun bindsFeature15StubFour(impl: Feature15StubFourImpl): Feature15StubFour

    @Binds
    fun bindsFeature15StubFive(impl: Feature15StubFiveImpl): Feature15StubFive

    @Binds
    fun bindsFeature15StubSix(impl: Feature15StubSixImpl): Feature15StubSix

    @Binds
    fun bindsFeature15StubSeven(impl: Feature15StubSevenImpl): Feature15StubSeven

    @Binds
    fun bindsFeature15StubEight(impl: Feature15StubEightImpl): Feature15StubEight

    @Binds
    fun bindsFeature15StubNine(impl: Feature15StubNineImpl): Feature15StubNine
    @Binds

    fun bindsFeature15StubTen(impl: Feature15StubTenImpl): Feature15StubTen
}