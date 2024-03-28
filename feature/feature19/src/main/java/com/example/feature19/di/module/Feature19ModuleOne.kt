package com.example.feature19.di.module

import com.example.feature19.feature.Feature19StubEight
import com.example.feature19.feature.Feature19StubEightImpl
import com.example.feature19.feature.Feature19StubFive
import com.example.feature19.feature.Feature19StubFiveImpl
import com.example.feature19.feature.Feature19StubFour
import com.example.feature19.feature.Feature19StubFourImpl
import com.example.feature19.feature.Feature19StubNine
import com.example.feature19.feature.Feature19StubNineImpl
import com.example.feature19.feature.Feature19StubOne
import com.example.feature19.feature.Feature19StubOneImpl
import com.example.feature19.feature.Feature19StubSeven
import com.example.feature19.feature.Feature19StubSevenImpl
import com.example.feature19.feature.Feature19StubSix
import com.example.feature19.feature.Feature19StubSixImpl
import com.example.feature19.feature.Feature19StubTen
import com.example.feature19.feature.Feature19StubTenImpl
import com.example.feature19.feature.Feature19StubThree
import com.example.feature19.feature.Feature19StubThreeImpl
import com.example.feature19.feature.Feature19StubTwo
import com.example.feature19.feature.Feature19StubTwoImpl
import dagger.Binds
import dagger.Module

@Module
interface Feature19ModuleOne {

    @Binds
    fun bindsFeature19StubOne(impl: Feature19StubOneImpl): Feature19StubOne

    @Binds
    fun bindsFeature19StubTwo(impl: Feature19StubTwoImpl): Feature19StubTwo

    @Binds
    fun bindsFeature19StubThree(impl: Feature19StubThreeImpl): Feature19StubThree

    @Binds
    fun bindsFeature19StubFour(impl: Feature19StubFourImpl): Feature19StubFour

    @Binds
    fun bindsFeature19StubFive(impl: Feature19StubFiveImpl): Feature19StubFive

    @Binds
    fun bindsFeature19StubSix(impl: Feature19StubSixImpl): Feature19StubSix

    @Binds
    fun bindsFeature19StubSeven(impl: Feature19StubSevenImpl): Feature19StubSeven

    @Binds
    fun bindsFeature19StubEight(impl: Feature19StubEightImpl): Feature19StubEight

    @Binds
    fun bindsFeature19StubNine(impl: Feature19StubNineImpl): Feature19StubNine
    @Binds

    fun bindsFeature19StubTen(impl: Feature19StubTenImpl): Feature19StubTen
}