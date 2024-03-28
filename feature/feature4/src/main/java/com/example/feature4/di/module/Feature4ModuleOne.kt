package com.example.feature4.di.module

import com.example.feature4.feature.Feature4StubEight
import com.example.feature4.feature.Feature4StubEightImpl
import com.example.feature4.feature.Feature4StubFive
import com.example.feature4.feature.Feature4StubFiveImpl
import com.example.feature4.feature.Feature4StubFour
import com.example.feature4.feature.Feature4StubFourImpl
import com.example.feature4.feature.Feature4StubNine
import com.example.feature4.feature.Feature4StubNineImpl
import com.example.feature4.feature.Feature4StubOne
import com.example.feature4.feature.Feature4StubOneImpl
import com.example.feature4.feature.Feature4StubSeven
import com.example.feature4.feature.Feature4StubSevenImpl
import com.example.feature4.feature.Feature4StubSix
import com.example.feature4.feature.Feature4StubSixImpl
import com.example.feature4.feature.Feature4StubTen
import com.example.feature4.feature.Feature4StubTenImpl
import com.example.feature4.feature.Feature4StubThree
import com.example.feature4.feature.Feature4StubThreeImpl
import com.example.feature4.feature.Feature4StubTwo
import com.example.feature4.feature.Feature4StubTwoImpl
import dagger.Binds
import dagger.Module

@Module
interface Feature4ModuleOne {

    @Binds
    fun bindsFeature4StubOne(impl: Feature4StubOneImpl): Feature4StubOne

    @Binds
    fun bindsFeature4StubTwo(impl: Feature4StubTwoImpl): Feature4StubTwo

    @Binds
    fun bindsFeature4StubThree(impl: Feature4StubThreeImpl): Feature4StubThree

    @Binds
    fun bindsFeature4StubFour(impl: Feature4StubFourImpl): Feature4StubFour

    @Binds
    fun bindsFeature4StubFive(impl: Feature4StubFiveImpl): Feature4StubFive

    @Binds
    fun bindsFeature4StubSix(impl: Feature4StubSixImpl): Feature4StubSix

    @Binds
    fun bindsFeature4StubSeven(impl: Feature4StubSevenImpl): Feature4StubSeven

    @Binds
    fun bindsFeature4StubEight(impl: Feature4StubEightImpl): Feature4StubEight

    @Binds
    fun bindsFeature4StubNine(impl: Feature4StubNineImpl): Feature4StubNine
    @Binds

    fun bindsFeature4StubTen(impl: Feature4StubTenImpl): Feature4StubTen
}