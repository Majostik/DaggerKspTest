package com.example.feature32.di.module

import com.example.feature32.feature.Feature32StubEight
import com.example.feature32.feature.Feature32StubEightImpl
import com.example.feature32.feature.Feature32StubFive
import com.example.feature32.feature.Feature32StubFiveImpl
import com.example.feature32.feature.Feature32StubFour
import com.example.feature32.feature.Feature32StubFourImpl
import com.example.feature32.feature.Feature32StubNine
import com.example.feature32.feature.Feature32StubNineImpl
import com.example.feature32.feature.Feature32StubOne
import com.example.feature32.feature.Feature32StubOneImpl
import com.example.feature32.feature.Feature32StubSeven
import com.example.feature32.feature.Feature32StubSevenImpl
import com.example.feature32.feature.Feature32StubSix
import com.example.feature32.feature.Feature32StubSixImpl
import com.example.feature32.feature.Feature32StubTen
import com.example.feature32.feature.Feature32StubTenImpl
import com.example.feature32.feature.Feature32StubThree
import com.example.feature32.feature.Feature32StubThreeImpl
import com.example.feature32.feature.Feature32StubTwo
import com.example.feature32.feature.Feature32StubTwoImpl
import dagger.Binds
import dagger.Module

@Module
interface Feature32ModuleOne {

    @Binds
    fun bindsFeature32StubOne(impl: Feature32StubOneImpl): Feature32StubOne

    @Binds
    fun bindsFeature32StubTwo(impl: Feature32StubTwoImpl): Feature32StubTwo

    @Binds
    fun bindsFeature32StubThree(impl: Feature32StubThreeImpl): Feature32StubThree

    @Binds
    fun bindsFeature32StubFour(impl: Feature32StubFourImpl): Feature32StubFour

    @Binds
    fun bindsFeature32StubFive(impl: Feature32StubFiveImpl): Feature32StubFive

    @Binds
    fun bindsFeature32StubSix(impl: Feature32StubSixImpl): Feature32StubSix

    @Binds
    fun bindsFeature32StubSeven(impl: Feature32StubSevenImpl): Feature32StubSeven

    @Binds
    fun bindsFeature32StubEight(impl: Feature32StubEightImpl): Feature32StubEight

    @Binds
    fun bindsFeature32StubNine(impl: Feature32StubNineImpl): Feature32StubNine
    @Binds

    fun bindsFeature32StubTen(impl: Feature32StubTenImpl): Feature32StubTen
}