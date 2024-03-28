package com.example.feature29.di.module

import com.example.feature29.feature.Feature29StubEight
import com.example.feature29.feature.Feature29StubEightImpl
import com.example.feature29.feature.Feature29StubFive
import com.example.feature29.feature.Feature29StubFiveImpl
import com.example.feature29.feature.Feature29StubFour
import com.example.feature29.feature.Feature29StubFourImpl
import com.example.feature29.feature.Feature29StubNine
import com.example.feature29.feature.Feature29StubNineImpl
import com.example.feature29.feature.Feature29StubOne
import com.example.feature29.feature.Feature29StubOneImpl
import com.example.feature29.feature.Feature29StubSeven
import com.example.feature29.feature.Feature29StubSevenImpl
import com.example.feature29.feature.Feature29StubSix
import com.example.feature29.feature.Feature29StubSixImpl
import com.example.feature29.feature.Feature29StubTen
import com.example.feature29.feature.Feature29StubTenImpl
import com.example.feature29.feature.Feature29StubThree
import com.example.feature29.feature.Feature29StubThreeImpl
import com.example.feature29.feature.Feature29StubTwo
import com.example.feature29.feature.Feature29StubTwoImpl
import dagger.Binds
import dagger.Module

@Module
interface Feature29ModuleOne {

    @Binds
    fun bindsFeature29StubOne(impl: Feature29StubOneImpl): Feature29StubOne

    @Binds
    fun bindsFeature29StubTwo(impl: Feature29StubTwoImpl): Feature29StubTwo

    @Binds
    fun bindsFeature29StubThree(impl: Feature29StubThreeImpl): Feature29StubThree

    @Binds
    fun bindsFeature29StubFour(impl: Feature29StubFourImpl): Feature29StubFour

    @Binds
    fun bindsFeature29StubFive(impl: Feature29StubFiveImpl): Feature29StubFive

    @Binds
    fun bindsFeature29StubSix(impl: Feature29StubSixImpl): Feature29StubSix

    @Binds
    fun bindsFeature29StubSeven(impl: Feature29StubSevenImpl): Feature29StubSeven

    @Binds
    fun bindsFeature29StubEight(impl: Feature29StubEightImpl): Feature29StubEight

    @Binds
    fun bindsFeature29StubNine(impl: Feature29StubNineImpl): Feature29StubNine
    @Binds

    fun bindsFeature29StubTen(impl: Feature29StubTenImpl): Feature29StubTen
}