package com.example.feature5.di.module

import com.example.feature5.feature.Feature5StubEight
import com.example.feature5.feature.Feature5StubEightImpl
import com.example.feature5.feature.Feature5StubFive
import com.example.feature5.feature.Feature5StubFiveImpl
import com.example.feature5.feature.Feature5StubFour
import com.example.feature5.feature.Feature5StubFourImpl
import com.example.feature5.feature.Feature5StubNine
import com.example.feature5.feature.Feature5StubNineImpl
import com.example.feature5.feature.Feature5StubOne
import com.example.feature5.feature.Feature5StubOneImpl
import com.example.feature5.feature.Feature5StubSeven
import com.example.feature5.feature.Feature5StubSevenImpl
import com.example.feature5.feature.Feature5StubSix
import com.example.feature5.feature.Feature5StubSixImpl
import com.example.feature5.feature.Feature5StubTen
import com.example.feature5.feature.Feature5StubTenImpl
import com.example.feature5.feature.Feature5StubThree
import com.example.feature5.feature.Feature5StubThreeImpl
import com.example.feature5.feature.Feature5StubTwo
import com.example.feature5.feature.Feature5StubTwoImpl
import dagger.Binds
import dagger.Module

@Module
interface Feature5ModuleOne {

    @Binds
    fun bindsFeature5StubOne(impl: Feature5StubOneImpl): Feature5StubOne

    @Binds
    fun bindsFeature5StubTwo(impl: Feature5StubTwoImpl): Feature5StubTwo

    @Binds
    fun bindsFeature5StubThree(impl: Feature5StubThreeImpl): Feature5StubThree

    @Binds
    fun bindsFeature5StubFour(impl: Feature5StubFourImpl): Feature5StubFour

    @Binds
    fun bindsFeature5StubFive(impl: Feature5StubFiveImpl): Feature5StubFive

    @Binds
    fun bindsFeature5StubSix(impl: Feature5StubSixImpl): Feature5StubSix

    @Binds
    fun bindsFeature5StubSeven(impl: Feature5StubSevenImpl): Feature5StubSeven

    @Binds
    fun bindsFeature5StubEight(impl: Feature5StubEightImpl): Feature5StubEight

    @Binds
    fun bindsFeature5StubNine(impl: Feature5StubNineImpl): Feature5StubNine
    @Binds

    fun bindsFeature5StubTen(impl: Feature5StubTenImpl): Feature5StubTen
}