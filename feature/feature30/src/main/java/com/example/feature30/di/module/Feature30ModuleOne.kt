package com.example.feature30.di.module

import com.example.feature30.feature.Feature30StubEight
import com.example.feature30.feature.Feature30StubEightImpl
import com.example.feature30.feature.Feature30StubFive
import com.example.feature30.feature.Feature30StubFiveImpl
import com.example.feature30.feature.Feature30StubFour
import com.example.feature30.feature.Feature30StubFourImpl
import com.example.feature30.feature.Feature30StubNine
import com.example.feature30.feature.Feature30StubNineImpl
import com.example.feature30.feature.Feature30StubOne
import com.example.feature30.feature.Feature30StubOneImpl
import com.example.feature30.feature.Feature30StubSeven
import com.example.feature30.feature.Feature30StubSevenImpl
import com.example.feature30.feature.Feature30StubSix
import com.example.feature30.feature.Feature30StubSixImpl
import com.example.feature30.feature.Feature30StubTen
import com.example.feature30.feature.Feature30StubTenImpl
import com.example.feature30.feature.Feature30StubThree
import com.example.feature30.feature.Feature30StubThreeImpl
import com.example.feature30.feature.Feature30StubTwo
import com.example.feature30.feature.Feature30StubTwoImpl
import dagger.Binds
import dagger.Module

@Module
interface Feature30ModuleOne {

    @Binds
    fun bindsFeature30StubOne(impl: Feature30StubOneImpl): Feature30StubOne

    @Binds
    fun bindsFeature30StubTwo(impl: Feature30StubTwoImpl): Feature30StubTwo

    @Binds
    fun bindsFeature30StubThree(impl: Feature30StubThreeImpl): Feature30StubThree

    @Binds
    fun bindsFeature30StubFour(impl: Feature30StubFourImpl): Feature30StubFour

    @Binds
    fun bindsFeature30StubFive(impl: Feature30StubFiveImpl): Feature30StubFive

    @Binds
    fun bindsFeature30StubSix(impl: Feature30StubSixImpl): Feature30StubSix

    @Binds
    fun bindsFeature30StubSeven(impl: Feature30StubSevenImpl): Feature30StubSeven

    @Binds
    fun bindsFeature30StubEight(impl: Feature30StubEightImpl): Feature30StubEight

    @Binds
    fun bindsFeature30StubNine(impl: Feature30StubNineImpl): Feature30StubNine
    @Binds

    fun bindsFeature30StubTen(impl: Feature30StubTenImpl): Feature30StubTen
}