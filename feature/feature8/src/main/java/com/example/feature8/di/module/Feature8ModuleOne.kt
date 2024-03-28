package com.example.feature8.di.module

import com.example.feature8.feature.Feature8StubEight
import com.example.feature8.feature.Feature8StubEightImpl
import com.example.feature8.feature.Feature8StubFive
import com.example.feature8.feature.Feature8StubFiveImpl
import com.example.feature8.feature.Feature8StubFour
import com.example.feature8.feature.Feature8StubFourImpl
import com.example.feature8.feature.Feature8StubNine
import com.example.feature8.feature.Feature8StubNineImpl
import com.example.feature8.feature.Feature8StubOne
import com.example.feature8.feature.Feature8StubOneImpl
import com.example.feature8.feature.Feature8StubSeven
import com.example.feature8.feature.Feature8StubSevenImpl
import com.example.feature8.feature.Feature8StubSix
import com.example.feature8.feature.Feature8StubSixImpl
import com.example.feature8.feature.Feature8StubTen
import com.example.feature8.feature.Feature8StubTenImpl
import com.example.feature8.feature.Feature8StubThree
import com.example.feature8.feature.Feature8StubThreeImpl
import com.example.feature8.feature.Feature8StubTwo
import com.example.feature8.feature.Feature8StubTwoImpl
import dagger.Binds
import dagger.Module

@Module
interface Feature8ModuleOne {

    @Binds
    fun bindsFeature8StubOne(impl: Feature8StubOneImpl): Feature8StubOne

    @Binds
    fun bindsFeature8StubTwo(impl: Feature8StubTwoImpl): Feature8StubTwo

    @Binds
    fun bindsFeature8StubThree(impl: Feature8StubThreeImpl): Feature8StubThree

    @Binds
    fun bindsFeature8StubFour(impl: Feature8StubFourImpl): Feature8StubFour

    @Binds
    fun bindsFeature8StubFive(impl: Feature8StubFiveImpl): Feature8StubFive

    @Binds
    fun bindsFeature8StubSix(impl: Feature8StubSixImpl): Feature8StubSix

    @Binds
    fun bindsFeature8StubSeven(impl: Feature8StubSevenImpl): Feature8StubSeven

    @Binds
    fun bindsFeature8StubEight(impl: Feature8StubEightImpl): Feature8StubEight

    @Binds
    fun bindsFeature8StubNine(impl: Feature8StubNineImpl): Feature8StubNine
    @Binds

    fun bindsFeature8StubTen(impl: Feature8StubTenImpl): Feature8StubTen
}