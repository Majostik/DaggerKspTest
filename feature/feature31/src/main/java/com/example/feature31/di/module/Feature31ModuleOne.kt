package com.example.feature31.di.module

import com.example.feature31.feature.Feature31StubEight
import com.example.feature31.feature.Feature31StubEightImpl
import com.example.feature31.feature.Feature31StubFive
import com.example.feature31.feature.Feature31StubFiveImpl
import com.example.feature31.feature.Feature31StubFour
import com.example.feature31.feature.Feature31StubFourImpl
import com.example.feature31.feature.Feature31StubNine
import com.example.feature31.feature.Feature31StubNineImpl
import com.example.feature31.feature.Feature31StubOne
import com.example.feature31.feature.Feature31StubOneImpl
import com.example.feature31.feature.Feature31StubSeven
import com.example.feature31.feature.Feature31StubSevenImpl
import com.example.feature31.feature.Feature31StubSix
import com.example.feature31.feature.Feature31StubSixImpl
import com.example.feature31.feature.Feature31StubTen
import com.example.feature31.feature.Feature31StubTenImpl
import com.example.feature31.feature.Feature31StubThree
import com.example.feature31.feature.Feature31StubThreeImpl
import com.example.feature31.feature.Feature31StubTwo
import com.example.feature31.feature.Feature31StubTwoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface Feature31ModuleOne {

    @Binds
    fun bindsFeature31StubOne(impl: Feature31StubOneImpl): Feature31StubOne

    @Binds
    fun bindsFeature31StubTwo(impl: Feature31StubTwoImpl): Feature31StubTwo

    @Binds
    fun bindsFeature31StubThree(impl: Feature31StubThreeImpl): Feature31StubThree

    @Binds
    fun bindsFeature31StubFour(impl: Feature31StubFourImpl): Feature31StubFour

    @Binds
    fun bindsFeature31StubFive(impl: Feature31StubFiveImpl): Feature31StubFive

    @Binds
    fun bindsFeature31StubSix(impl: Feature31StubSixImpl): Feature31StubSix

    @Binds
    fun bindsFeature31StubSeven(impl: Feature31StubSevenImpl): Feature31StubSeven

    @Binds
    fun bindsFeature31StubEight(impl: Feature31StubEightImpl): Feature31StubEight

    @Binds
    fun bindsFeature31StubNine(impl: Feature31StubNineImpl): Feature31StubNine
    @Binds

    fun bindsFeature31StubTen(impl: Feature31StubTenImpl): Feature31StubTen
}