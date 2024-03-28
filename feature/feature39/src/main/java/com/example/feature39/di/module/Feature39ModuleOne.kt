package com.example.feature39.di.module

import com.example.feature39.feature.Feature39StubEight
import com.example.feature39.feature.Feature39StubEightImpl
import com.example.feature39.feature.Feature39StubFive
import com.example.feature39.feature.Feature39StubFiveImpl
import com.example.feature39.feature.Feature39StubFour
import com.example.feature39.feature.Feature39StubFourImpl
import com.example.feature39.feature.Feature39StubNine
import com.example.feature39.feature.Feature39StubNineImpl
import com.example.feature39.feature.Feature39StubOne
import com.example.feature39.feature.Feature39StubOneImpl
import com.example.feature39.feature.Feature39StubSeven
import com.example.feature39.feature.Feature39StubSevenImpl
import com.example.feature39.feature.Feature39StubSix
import com.example.feature39.feature.Feature39StubSixImpl
import com.example.feature39.feature.Feature39StubTen
import com.example.feature39.feature.Feature39StubTenImpl
import com.example.feature39.feature.Feature39StubThree
import com.example.feature39.feature.Feature39StubThreeImpl
import com.example.feature39.feature.Feature39StubTwo
import com.example.feature39.feature.Feature39StubTwoImpl
import dagger.Binds
import dagger.Module

@Module
interface Feature39ModuleOne {

    @Binds
    fun bindsFeature39StubOne(impl: Feature39StubOneImpl): Feature39StubOne

    @Binds
    fun bindsFeature39StubTwo(impl: Feature39StubTwoImpl): Feature39StubTwo

    @Binds
    fun bindsFeature39StubThree(impl: Feature39StubThreeImpl): Feature39StubThree

    @Binds
    fun bindsFeature39StubFour(impl: Feature39StubFourImpl): Feature39StubFour

    @Binds
    fun bindsFeature39StubFive(impl: Feature39StubFiveImpl): Feature39StubFive

    @Binds
    fun bindsFeature39StubSix(impl: Feature39StubSixImpl): Feature39StubSix

    @Binds
    fun bindsFeature39StubSeven(impl: Feature39StubSevenImpl): Feature39StubSeven

    @Binds
    fun bindsFeature39StubEight(impl: Feature39StubEightImpl): Feature39StubEight

    @Binds
    fun bindsFeature39StubNine(impl: Feature39StubNineImpl): Feature39StubNine
    @Binds

    fun bindsFeature39StubTen(impl: Feature39StubTenImpl): Feature39StubTen
}