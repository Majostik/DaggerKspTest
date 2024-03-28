package com.example.feature47.di.module

import com.example.feature47.feature.Feature47StubEight
import com.example.feature47.feature.Feature47StubEightImpl
import com.example.feature47.feature.Feature47StubFive
import com.example.feature47.feature.Feature47StubFiveImpl
import com.example.feature47.feature.Feature47StubFour
import com.example.feature47.feature.Feature47StubFourImpl
import com.example.feature47.feature.Feature47StubNine
import com.example.feature47.feature.Feature47StubNineImpl
import com.example.feature47.feature.Feature47StubOne
import com.example.feature47.feature.Feature47StubOneImpl
import com.example.feature47.feature.Feature47StubSeven
import com.example.feature47.feature.Feature47StubSevenImpl
import com.example.feature47.feature.Feature47StubSix
import com.example.feature47.feature.Feature47StubSixImpl
import com.example.feature47.feature.Feature47StubTen
import com.example.feature47.feature.Feature47StubTenImpl
import com.example.feature47.feature.Feature47StubThree
import com.example.feature47.feature.Feature47StubThreeImpl
import com.example.feature47.feature.Feature47StubTwo
import com.example.feature47.feature.Feature47StubTwoImpl
import dagger.Binds
import dagger.Module

@Module
interface Feature47ModuleOne {

    @Binds
    fun bindsFeature47StubOne(impl: Feature47StubOneImpl): Feature47StubOne

    @Binds
    fun bindsFeature47StubTwo(impl: Feature47StubTwoImpl): Feature47StubTwo

    @Binds
    fun bindsFeature47StubThree(impl: Feature47StubThreeImpl): Feature47StubThree

    @Binds
    fun bindsFeature47StubFour(impl: Feature47StubFourImpl): Feature47StubFour

    @Binds
    fun bindsFeature47StubFive(impl: Feature47StubFiveImpl): Feature47StubFive

    @Binds
    fun bindsFeature47StubSix(impl: Feature47StubSixImpl): Feature47StubSix

    @Binds
    fun bindsFeature47StubSeven(impl: Feature47StubSevenImpl): Feature47StubSeven

    @Binds
    fun bindsFeature47StubEight(impl: Feature47StubEightImpl): Feature47StubEight

    @Binds
    fun bindsFeature47StubNine(impl: Feature47StubNineImpl): Feature47StubNine
    @Binds

    fun bindsFeature47StubTen(impl: Feature47StubTenImpl): Feature47StubTen
}