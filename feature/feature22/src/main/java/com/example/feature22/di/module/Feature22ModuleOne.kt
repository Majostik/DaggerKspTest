package com.example.feature22.di.module

import com.example.feature22.feature.Feature22StubEight
import com.example.feature22.feature.Feature22StubEightImpl
import com.example.feature22.feature.Feature22StubFive
import com.example.feature22.feature.Feature22StubFiveImpl
import com.example.feature22.feature.Feature22StubFour
import com.example.feature22.feature.Feature22StubFourImpl
import com.example.feature22.feature.Feature22StubNine
import com.example.feature22.feature.Feature22StubNineImpl
import com.example.feature22.feature.Feature22StubOne
import com.example.feature22.feature.Feature22StubOneImpl
import com.example.feature22.feature.Feature22StubSeven
import com.example.feature22.feature.Feature22StubSevenImpl
import com.example.feature22.feature.Feature22StubSix
import com.example.feature22.feature.Feature22StubSixImpl
import com.example.feature22.feature.Feature22StubTen
import com.example.feature22.feature.Feature22StubTenImpl
import com.example.feature22.feature.Feature22StubThree
import com.example.feature22.feature.Feature22StubThreeImpl
import com.example.feature22.feature.Feature22StubTwo
import com.example.feature22.feature.Feature22StubTwoImpl
import dagger.Binds
import dagger.Module

@Module
interface Feature22ModuleOne {

    @Binds
    fun bindsFeature22StubOne(impl: Feature22StubOneImpl): Feature22StubOne

    @Binds
    fun bindsFeature22StubTwo(impl: Feature22StubTwoImpl): Feature22StubTwo

    @Binds
    fun bindsFeature22StubThree(impl: Feature22StubThreeImpl): Feature22StubThree

    @Binds
    fun bindsFeature22StubFour(impl: Feature22StubFourImpl): Feature22StubFour

    @Binds
    fun bindsFeature22StubFive(impl: Feature22StubFiveImpl): Feature22StubFive

    @Binds
    fun bindsFeature22StubSix(impl: Feature22StubSixImpl): Feature22StubSix

    @Binds
    fun bindsFeature22StubSeven(impl: Feature22StubSevenImpl): Feature22StubSeven

    @Binds
    fun bindsFeature22StubEight(impl: Feature22StubEightImpl): Feature22StubEight

    @Binds
    fun bindsFeature22StubNine(impl: Feature22StubNineImpl): Feature22StubNine
    @Binds

    fun bindsFeature22StubTen(impl: Feature22StubTenImpl): Feature22StubTen
}