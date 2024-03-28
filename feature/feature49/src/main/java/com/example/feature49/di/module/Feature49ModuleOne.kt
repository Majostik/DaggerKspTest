package com.example.feature49.di.module

import com.example.feature49.feature.Feature49StubEight
import com.example.feature49.feature.Feature49StubEightImpl
import com.example.feature49.feature.Feature49StubFive
import com.example.feature49.feature.Feature49StubFiveImpl
import com.example.feature49.feature.Feature49StubFour
import com.example.feature49.feature.Feature49StubFourImpl
import com.example.feature49.feature.Feature49StubNine
import com.example.feature49.feature.Feature49StubNineImpl
import com.example.feature49.feature.Feature49StubOne
import com.example.feature49.feature.Feature49StubOneImpl
import com.example.feature49.feature.Feature49StubSeven
import com.example.feature49.feature.Feature49StubSevenImpl
import com.example.feature49.feature.Feature49StubSix
import com.example.feature49.feature.Feature49StubSixImpl
import com.example.feature49.feature.Feature49StubTen
import com.example.feature49.feature.Feature49StubTenImpl
import com.example.feature49.feature.Feature49StubThree
import com.example.feature49.feature.Feature49StubThreeImpl
import com.example.feature49.feature.Feature49StubTwo
import com.example.feature49.feature.Feature49StubTwoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface Feature49ModuleOne {

    @Binds
    fun bindsFeature49StubOne(impl: Feature49StubOneImpl): Feature49StubOne

    @Binds
    fun bindsFeature49StubTwo(impl: Feature49StubTwoImpl): Feature49StubTwo

    @Binds
    fun bindsFeature49StubThree(impl: Feature49StubThreeImpl): Feature49StubThree

    @Binds
    fun bindsFeature49StubFour(impl: Feature49StubFourImpl): Feature49StubFour

    @Binds
    fun bindsFeature49StubFive(impl: Feature49StubFiveImpl): Feature49StubFive

    @Binds
    fun bindsFeature49StubSix(impl: Feature49StubSixImpl): Feature49StubSix

    @Binds
    fun bindsFeature49StubSeven(impl: Feature49StubSevenImpl): Feature49StubSeven

    @Binds
    fun bindsFeature49StubEight(impl: Feature49StubEightImpl): Feature49StubEight

    @Binds
    fun bindsFeature49StubNine(impl: Feature49StubNineImpl): Feature49StubNine
    @Binds

    fun bindsFeature49StubTen(impl: Feature49StubTenImpl): Feature49StubTen
}