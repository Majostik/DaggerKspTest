package com.example.feature14.di.module

import com.example.feature14.feature.Feature14StubEight
import com.example.feature14.feature.Feature14StubEightImpl
import com.example.feature14.feature.Feature14StubFive
import com.example.feature14.feature.Feature14StubFiveImpl
import com.example.feature14.feature.Feature14StubFour
import com.example.feature14.feature.Feature14StubFourImpl
import com.example.feature14.feature.Feature14StubNine
import com.example.feature14.feature.Feature14StubNineImpl
import com.example.feature14.feature.Feature14StubOne
import com.example.feature14.feature.Feature14StubOneImpl
import com.example.feature14.feature.Feature14StubSeven
import com.example.feature14.feature.Feature14StubSevenImpl
import com.example.feature14.feature.Feature14StubSix
import com.example.feature14.feature.Feature14StubSixImpl
import com.example.feature14.feature.Feature14StubTen
import com.example.feature14.feature.Feature14StubTenImpl
import com.example.feature14.feature.Feature14StubThree
import com.example.feature14.feature.Feature14StubThreeImpl
import com.example.feature14.feature.Feature14StubTwo
import com.example.feature14.feature.Feature14StubTwoImpl
import dagger.Binds
import dagger.Module

@Module
interface Feature14ModuleOne {

    @Binds
    fun bindsFeature14StubOne(impl: Feature14StubOneImpl): Feature14StubOne

    @Binds
    fun bindsFeature14StubTwo(impl: Feature14StubTwoImpl): Feature14StubTwo

    @Binds
    fun bindsFeature14StubThree(impl: Feature14StubThreeImpl): Feature14StubThree

    @Binds
    fun bindsFeature14StubFour(impl: Feature14StubFourImpl): Feature14StubFour

    @Binds
    fun bindsFeature14StubFive(impl: Feature14StubFiveImpl): Feature14StubFive

    @Binds
    fun bindsFeature14StubSix(impl: Feature14StubSixImpl): Feature14StubSix

    @Binds
    fun bindsFeature14StubSeven(impl: Feature14StubSevenImpl): Feature14StubSeven

    @Binds
    fun bindsFeature14StubEight(impl: Feature14StubEightImpl): Feature14StubEight

    @Binds
    fun bindsFeature14StubNine(impl: Feature14StubNineImpl): Feature14StubNine
    @Binds

    fun bindsFeature14StubTen(impl: Feature14StubTenImpl): Feature14StubTen
}