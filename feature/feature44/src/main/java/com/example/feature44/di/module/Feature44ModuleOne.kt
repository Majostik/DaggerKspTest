package com.example.feature44.di.module

import com.example.feature44.feature.Feature44StubEight
import com.example.feature44.feature.Feature44StubEightImpl
import com.example.feature44.feature.Feature44StubFive
import com.example.feature44.feature.Feature44StubFiveImpl
import com.example.feature44.feature.Feature44StubFour
import com.example.feature44.feature.Feature44StubFourImpl
import com.example.feature44.feature.Feature44StubNine
import com.example.feature44.feature.Feature44StubNineImpl
import com.example.feature44.feature.Feature44StubOne
import com.example.feature44.feature.Feature44StubOneImpl
import com.example.feature44.feature.Feature44StubSeven
import com.example.feature44.feature.Feature44StubSevenImpl
import com.example.feature44.feature.Feature44StubSix
import com.example.feature44.feature.Feature44StubSixImpl
import com.example.feature44.feature.Feature44StubTen
import com.example.feature44.feature.Feature44StubTenImpl
import com.example.feature44.feature.Feature44StubThree
import com.example.feature44.feature.Feature44StubThreeImpl
import com.example.feature44.feature.Feature44StubTwo
import com.example.feature44.feature.Feature44StubTwoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface Feature44ModuleOne {

    @Binds
    fun bindsFeature44StubOne(impl: Feature44StubOneImpl): Feature44StubOne

    @Binds
    fun bindsFeature44StubTwo(impl: Feature44StubTwoImpl): Feature44StubTwo

    @Binds
    fun bindsFeature44StubThree(impl: Feature44StubThreeImpl): Feature44StubThree

    @Binds
    fun bindsFeature44StubFour(impl: Feature44StubFourImpl): Feature44StubFour

    @Binds
    fun bindsFeature44StubFive(impl: Feature44StubFiveImpl): Feature44StubFive

    @Binds
    fun bindsFeature44StubSix(impl: Feature44StubSixImpl): Feature44StubSix

    @Binds
    fun bindsFeature44StubSeven(impl: Feature44StubSevenImpl): Feature44StubSeven

    @Binds
    fun bindsFeature44StubEight(impl: Feature44StubEightImpl): Feature44StubEight

    @Binds
    fun bindsFeature44StubNine(impl: Feature44StubNineImpl): Feature44StubNine
    @Binds

    fun bindsFeature44StubTen(impl: Feature44StubTenImpl): Feature44StubTen
}