package com.example.feature26.di.module

import com.example.feature26.feature.Feature26StubEight
import com.example.feature26.feature.Feature26StubEightImpl
import com.example.feature26.feature.Feature26StubFive
import com.example.feature26.feature.Feature26StubFiveImpl
import com.example.feature26.feature.Feature26StubFour
import com.example.feature26.feature.Feature26StubFourImpl
import com.example.feature26.feature.Feature26StubNine
import com.example.feature26.feature.Feature26StubNineImpl
import com.example.feature26.feature.Feature26StubOne
import com.example.feature26.feature.Feature26StubOneImpl
import com.example.feature26.feature.Feature26StubSeven
import com.example.feature26.feature.Feature26StubSevenImpl
import com.example.feature26.feature.Feature26StubSix
import com.example.feature26.feature.Feature26StubSixImpl
import com.example.feature26.feature.Feature26StubTen
import com.example.feature26.feature.Feature26StubTenImpl
import com.example.feature26.feature.Feature26StubThree
import com.example.feature26.feature.Feature26StubThreeImpl
import com.example.feature26.feature.Feature26StubTwo
import com.example.feature26.feature.Feature26StubTwoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface Feature26ModuleOne {

    @Binds
    fun bindsFeature26StubOne(impl: Feature26StubOneImpl): Feature26StubOne

    @Binds
    fun bindsFeature26StubTwo(impl: Feature26StubTwoImpl): Feature26StubTwo

    @Binds
    fun bindsFeature26StubThree(impl: Feature26StubThreeImpl): Feature26StubThree

    @Binds
    fun bindsFeature26StubFour(impl: Feature26StubFourImpl): Feature26StubFour

    @Binds
    fun bindsFeature26StubFive(impl: Feature26StubFiveImpl): Feature26StubFive

    @Binds
    fun bindsFeature26StubSix(impl: Feature26StubSixImpl): Feature26StubSix

    @Binds
    fun bindsFeature26StubSeven(impl: Feature26StubSevenImpl): Feature26StubSeven

    @Binds
    fun bindsFeature26StubEight(impl: Feature26StubEightImpl): Feature26StubEight

    @Binds
    fun bindsFeature26StubNine(impl: Feature26StubNineImpl): Feature26StubNine
    @Binds

    fun bindsFeature26StubTen(impl: Feature26StubTenImpl): Feature26StubTen
}