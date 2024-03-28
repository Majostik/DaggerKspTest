package com.example.feature3.di.module

import com.example.feature3.feature.Feature3StubEight
import com.example.feature3.feature.Feature3StubEightImpl
import com.example.feature3.feature.Feature3StubFive
import com.example.feature3.feature.Feature3StubFiveImpl
import com.example.feature3.feature.Feature3StubFour
import com.example.feature3.feature.Feature3StubFourImpl
import com.example.feature3.feature.Feature3StubNine
import com.example.feature3.feature.Feature3StubNineImpl
import com.example.feature3.feature.Feature3StubOne
import com.example.feature3.feature.Feature3StubOneImpl
import com.example.feature3.feature.Feature3StubSeven
import com.example.feature3.feature.Feature3StubSevenImpl
import com.example.feature3.feature.Feature3StubSix
import com.example.feature3.feature.Feature3StubSixImpl
import com.example.feature3.feature.Feature3StubTen
import com.example.feature3.feature.Feature3StubTenImpl
import com.example.feature3.feature.Feature3StubThree
import com.example.feature3.feature.Feature3StubThreeImpl
import com.example.feature3.feature.Feature3StubTwo
import com.example.feature3.feature.Feature3StubTwoImpl
import dagger.Binds
import dagger.Module

@Module
interface Feature3ModuleOne {

    @Binds
    fun bindsFeature3StubOne(impl: Feature3StubOneImpl): Feature3StubOne

    @Binds
    fun bindsFeature3StubTwo(impl: Feature3StubTwoImpl): Feature3StubTwo

    @Binds
    fun bindsFeature3StubThree(impl: Feature3StubThreeImpl): Feature3StubThree

    @Binds
    fun bindsFeature3StubFour(impl: Feature3StubFourImpl): Feature3StubFour

    @Binds
    fun bindsFeature3StubFive(impl: Feature3StubFiveImpl): Feature3StubFive

    @Binds
    fun bindsFeature3StubSix(impl: Feature3StubSixImpl): Feature3StubSix

    @Binds
    fun bindsFeature3StubSeven(impl: Feature3StubSevenImpl): Feature3StubSeven

    @Binds
    fun bindsFeature3StubEight(impl: Feature3StubEightImpl): Feature3StubEight

    @Binds
    fun bindsFeature3StubNine(impl: Feature3StubNineImpl): Feature3StubNine
    @Binds

    fun bindsFeature3StubTen(impl: Feature3StubTenImpl): Feature3StubTen
}