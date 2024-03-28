package com.example.feature50.di.module

import com.example.feature50.feature.Feature50StubEight
import com.example.feature50.feature.Feature50StubEightImpl
import com.example.feature50.feature.Feature50StubFive
import com.example.feature50.feature.Feature50StubFiveImpl
import com.example.feature50.feature.Feature50StubFour
import com.example.feature50.feature.Feature50StubFourImpl
import com.example.feature50.feature.Feature50StubNine
import com.example.feature50.feature.Feature50StubNineImpl
import com.example.feature50.feature.Feature50StubOne
import com.example.feature50.feature.Feature50StubOneImpl
import com.example.feature50.feature.Feature50StubSeven
import com.example.feature50.feature.Feature50StubSevenImpl
import com.example.feature50.feature.Feature50StubSix
import com.example.feature50.feature.Feature50StubSixImpl
import com.example.feature50.feature.Feature50StubTen
import com.example.feature50.feature.Feature50StubTenImpl
import com.example.feature50.feature.Feature50StubThree
import com.example.feature50.feature.Feature50StubThreeImpl
import com.example.feature50.feature.Feature50StubTwo
import com.example.feature50.feature.Feature50StubTwoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface Feature50ModuleOne {

    @Binds
    fun bindsFeature50StubOne(impl: Feature50StubOneImpl): Feature50StubOne

    @Binds
    fun bindsFeature50StubTwo(impl: Feature50StubTwoImpl): Feature50StubTwo

    @Binds
    fun bindsFeature50StubThree(impl: Feature50StubThreeImpl): Feature50StubThree

    @Binds
    fun bindsFeature50StubFour(impl: Feature50StubFourImpl): Feature50StubFour

    @Binds
    fun bindsFeature50StubFive(impl: Feature50StubFiveImpl): Feature50StubFive

    @Binds
    fun bindsFeature50StubSix(impl: Feature50StubSixImpl): Feature50StubSix

    @Binds
    fun bindsFeature50StubSeven(impl: Feature50StubSevenImpl): Feature50StubSeven

    @Binds
    fun bindsFeature50StubEight(impl: Feature50StubEightImpl): Feature50StubEight

    @Binds
    fun bindsFeature50StubNine(impl: Feature50StubNineImpl): Feature50StubNine
    @Binds

    fun bindsFeature50StubTen(impl: Feature50StubTenImpl): Feature50StubTen
}