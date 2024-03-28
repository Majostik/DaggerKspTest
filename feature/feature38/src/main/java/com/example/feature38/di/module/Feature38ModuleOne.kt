package com.example.feature38.di.module

import com.example.feature38.feature.Feature38StubEight
import com.example.feature38.feature.Feature38StubEightImpl
import com.example.feature38.feature.Feature38StubFive
import com.example.feature38.feature.Feature38StubFiveImpl
import com.example.feature38.feature.Feature38StubFour
import com.example.feature38.feature.Feature38StubFourImpl
import com.example.feature38.feature.Feature38StubNine
import com.example.feature38.feature.Feature38StubNineImpl
import com.example.feature38.feature.Feature38StubOne
import com.example.feature38.feature.Feature38StubOneImpl
import com.example.feature38.feature.Feature38StubSeven
import com.example.feature38.feature.Feature38StubSevenImpl
import com.example.feature38.feature.Feature38StubSix
import com.example.feature38.feature.Feature38StubSixImpl
import com.example.feature38.feature.Feature38StubTen
import com.example.feature38.feature.Feature38StubTenImpl
import com.example.feature38.feature.Feature38StubThree
import com.example.feature38.feature.Feature38StubThreeImpl
import com.example.feature38.feature.Feature38StubTwo
import com.example.feature38.feature.Feature38StubTwoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface Feature38ModuleOne {

    @Binds
    fun bindsFeature38StubOne(impl: Feature38StubOneImpl): Feature38StubOne

    @Binds
    fun bindsFeature38StubTwo(impl: Feature38StubTwoImpl): Feature38StubTwo

    @Binds
    fun bindsFeature38StubThree(impl: Feature38StubThreeImpl): Feature38StubThree

    @Binds
    fun bindsFeature38StubFour(impl: Feature38StubFourImpl): Feature38StubFour

    @Binds
    fun bindsFeature38StubFive(impl: Feature38StubFiveImpl): Feature38StubFive

    @Binds
    fun bindsFeature38StubSix(impl: Feature38StubSixImpl): Feature38StubSix

    @Binds
    fun bindsFeature38StubSeven(impl: Feature38StubSevenImpl): Feature38StubSeven

    @Binds
    fun bindsFeature38StubEight(impl: Feature38StubEightImpl): Feature38StubEight

    @Binds
    fun bindsFeature38StubNine(impl: Feature38StubNineImpl): Feature38StubNine
    @Binds

    fun bindsFeature38StubTen(impl: Feature38StubTenImpl): Feature38StubTen
}