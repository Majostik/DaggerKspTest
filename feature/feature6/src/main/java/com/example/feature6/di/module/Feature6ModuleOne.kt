package com.example.feature6.di.module

import com.example.feature6.feature.Feature6StubEight
import com.example.feature6.feature.Feature6StubEightImpl
import com.example.feature6.feature.Feature6StubFive
import com.example.feature6.feature.Feature6StubFiveImpl
import com.example.feature6.feature.Feature6StubFour
import com.example.feature6.feature.Feature6StubFourImpl
import com.example.feature6.feature.Feature6StubNine
import com.example.feature6.feature.Feature6StubNineImpl
import com.example.feature6.feature.Feature6StubOne
import com.example.feature6.feature.Feature6StubOneImpl
import com.example.feature6.feature.Feature6StubSeven
import com.example.feature6.feature.Feature6StubSevenImpl
import com.example.feature6.feature.Feature6StubSix
import com.example.feature6.feature.Feature6StubSixImpl
import com.example.feature6.feature.Feature6StubTen
import com.example.feature6.feature.Feature6StubTenImpl
import com.example.feature6.feature.Feature6StubThree
import com.example.feature6.feature.Feature6StubThreeImpl
import com.example.feature6.feature.Feature6StubTwo
import com.example.feature6.feature.Feature6StubTwoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface Feature6ModuleOne {

    @Binds
    fun bindsFeature6StubOne(impl: Feature6StubOneImpl): Feature6StubOne

    @Binds
    fun bindsFeature6StubTwo(impl: Feature6StubTwoImpl): Feature6StubTwo

    @Binds
    fun bindsFeature6StubThree(impl: Feature6StubThreeImpl): Feature6StubThree

    @Binds
    fun bindsFeature6StubFour(impl: Feature6StubFourImpl): Feature6StubFour

    @Binds
    fun bindsFeature6StubFive(impl: Feature6StubFiveImpl): Feature6StubFive

    @Binds
    fun bindsFeature6StubSix(impl: Feature6StubSixImpl): Feature6StubSix

    @Binds
    fun bindsFeature6StubSeven(impl: Feature6StubSevenImpl): Feature6StubSeven

    @Binds
    fun bindsFeature6StubEight(impl: Feature6StubEightImpl): Feature6StubEight

    @Binds
    fun bindsFeature6StubNine(impl: Feature6StubNineImpl): Feature6StubNine
    @Binds

    fun bindsFeature6StubTen(impl: Feature6StubTenImpl): Feature6StubTen
}