package com.example.feature28.di.module

import com.example.feature28.feature.Feature28StubEight
import com.example.feature28.feature.Feature28StubEightImpl
import com.example.feature28.feature.Feature28StubFive
import com.example.feature28.feature.Feature28StubFiveImpl
import com.example.feature28.feature.Feature28StubFour
import com.example.feature28.feature.Feature28StubFourImpl
import com.example.feature28.feature.Feature28StubNine
import com.example.feature28.feature.Feature28StubNineImpl
import com.example.feature28.feature.Feature28StubOne
import com.example.feature28.feature.Feature28StubOneImpl
import com.example.feature28.feature.Feature28StubSeven
import com.example.feature28.feature.Feature28StubSevenImpl
import com.example.feature28.feature.Feature28StubSix
import com.example.feature28.feature.Feature28StubSixImpl
import com.example.feature28.feature.Feature28StubTen
import com.example.feature28.feature.Feature28StubTenImpl
import com.example.feature28.feature.Feature28StubThree
import com.example.feature28.feature.Feature28StubThreeImpl
import com.example.feature28.feature.Feature28StubTwo
import com.example.feature28.feature.Feature28StubTwoImpl
import dagger.Binds
import dagger.Module

@Module
interface Feature28ModuleOne {

    @Binds
    fun bindsFeature28StubOne(impl: Feature28StubOneImpl): Feature28StubOne

    @Binds
    fun bindsFeature28StubTwo(impl: Feature28StubTwoImpl): Feature28StubTwo

    @Binds
    fun bindsFeature28StubThree(impl: Feature28StubThreeImpl): Feature28StubThree

    @Binds
    fun bindsFeature28StubFour(impl: Feature28StubFourImpl): Feature28StubFour

    @Binds
    fun bindsFeature28StubFive(impl: Feature28StubFiveImpl): Feature28StubFive

    @Binds
    fun bindsFeature28StubSix(impl: Feature28StubSixImpl): Feature28StubSix

    @Binds
    fun bindsFeature28StubSeven(impl: Feature28StubSevenImpl): Feature28StubSeven

    @Binds
    fun bindsFeature28StubEight(impl: Feature28StubEightImpl): Feature28StubEight

    @Binds
    fun bindsFeature28StubNine(impl: Feature28StubNineImpl): Feature28StubNine
    @Binds

    fun bindsFeature28StubTen(impl: Feature28StubTenImpl): Feature28StubTen
}