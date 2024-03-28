package com.example.feature25.di.module

import com.example.feature25.feature.Feature25StubEight
import com.example.feature25.feature.Feature25StubEightImpl
import com.example.feature25.feature.Feature25StubFive
import com.example.feature25.feature.Feature25StubFiveImpl
import com.example.feature25.feature.Feature25StubFour
import com.example.feature25.feature.Feature25StubFourImpl
import com.example.feature25.feature.Feature25StubNine
import com.example.feature25.feature.Feature25StubNineImpl
import com.example.feature25.feature.Feature25StubOne
import com.example.feature25.feature.Feature25StubOneImpl
import com.example.feature25.feature.Feature25StubSeven
import com.example.feature25.feature.Feature25StubSevenImpl
import com.example.feature25.feature.Feature25StubSix
import com.example.feature25.feature.Feature25StubSixImpl
import com.example.feature25.feature.Feature25StubTen
import com.example.feature25.feature.Feature25StubTenImpl
import com.example.feature25.feature.Feature25StubThree
import com.example.feature25.feature.Feature25StubThreeImpl
import com.example.feature25.feature.Feature25StubTwo
import com.example.feature25.feature.Feature25StubTwoImpl
import dagger.Binds
import dagger.Module

@Module
interface Feature25ModuleOne {

    @Binds
    fun bindsFeature25StubOne(impl: Feature25StubOneImpl): Feature25StubOne

    @Binds
    fun bindsFeature25StubTwo(impl: Feature25StubTwoImpl): Feature25StubTwo

    @Binds
    fun bindsFeature25StubThree(impl: Feature25StubThreeImpl): Feature25StubThree

    @Binds
    fun bindsFeature25StubFour(impl: Feature25StubFourImpl): Feature25StubFour

    @Binds
    fun bindsFeature25StubFive(impl: Feature25StubFiveImpl): Feature25StubFive

    @Binds
    fun bindsFeature25StubSix(impl: Feature25StubSixImpl): Feature25StubSix

    @Binds
    fun bindsFeature25StubSeven(impl: Feature25StubSevenImpl): Feature25StubSeven

    @Binds
    fun bindsFeature25StubEight(impl: Feature25StubEightImpl): Feature25StubEight

    @Binds
    fun bindsFeature25StubNine(impl: Feature25StubNineImpl): Feature25StubNine
    @Binds

    fun bindsFeature25StubTen(impl: Feature25StubTenImpl): Feature25StubTen
}