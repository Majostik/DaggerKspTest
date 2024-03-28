package com.example.feature45.di.module

import com.example.feature45.feature.Feature45StubEight
import com.example.feature45.feature.Feature45StubEightImpl
import com.example.feature45.feature.Feature45StubFive
import com.example.feature45.feature.Feature45StubFiveImpl
import com.example.feature45.feature.Feature45StubFour
import com.example.feature45.feature.Feature45StubFourImpl
import com.example.feature45.feature.Feature45StubNine
import com.example.feature45.feature.Feature45StubNineImpl
import com.example.feature45.feature.Feature45StubOne
import com.example.feature45.feature.Feature45StubOneImpl
import com.example.feature45.feature.Feature45StubSeven
import com.example.feature45.feature.Feature45StubSevenImpl
import com.example.feature45.feature.Feature45StubSix
import com.example.feature45.feature.Feature45StubSixImpl
import com.example.feature45.feature.Feature45StubTen
import com.example.feature45.feature.Feature45StubTenImpl
import com.example.feature45.feature.Feature45StubThree
import com.example.feature45.feature.Feature45StubThreeImpl
import com.example.feature45.feature.Feature45StubTwo
import com.example.feature45.feature.Feature45StubTwoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface Feature45ModuleOne {

    @Binds
    fun bindsFeature45StubOne(impl: Feature45StubOneImpl): Feature45StubOne

    @Binds
    fun bindsFeature45StubTwo(impl: Feature45StubTwoImpl): Feature45StubTwo

    @Binds
    fun bindsFeature45StubThree(impl: Feature45StubThreeImpl): Feature45StubThree

    @Binds
    fun bindsFeature45StubFour(impl: Feature45StubFourImpl): Feature45StubFour

    @Binds
    fun bindsFeature45StubFive(impl: Feature45StubFiveImpl): Feature45StubFive

    @Binds
    fun bindsFeature45StubSix(impl: Feature45StubSixImpl): Feature45StubSix

    @Binds
    fun bindsFeature45StubSeven(impl: Feature45StubSevenImpl): Feature45StubSeven

    @Binds
    fun bindsFeature45StubEight(impl: Feature45StubEightImpl): Feature45StubEight

    @Binds
    fun bindsFeature45StubNine(impl: Feature45StubNineImpl): Feature45StubNine
    @Binds

    fun bindsFeature45StubTen(impl: Feature45StubTenImpl): Feature45StubTen
}