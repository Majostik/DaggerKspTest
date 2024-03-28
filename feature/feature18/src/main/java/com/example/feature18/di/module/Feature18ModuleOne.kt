package com.example.feature18.di.module

import com.example.feature18.feature.Feature18StubEight
import com.example.feature18.feature.Feature18StubEightImpl
import com.example.feature18.feature.Feature18StubFive
import com.example.feature18.feature.Feature18StubFiveImpl
import com.example.feature18.feature.Feature18StubFour
import com.example.feature18.feature.Feature18StubFourImpl
import com.example.feature18.feature.Feature18StubNine
import com.example.feature18.feature.Feature18StubNineImpl
import com.example.feature18.feature.Feature18StubOne
import com.example.feature18.feature.Feature18StubOneImpl
import com.example.feature18.feature.Feature18StubSeven
import com.example.feature18.feature.Feature18StubSevenImpl
import com.example.feature18.feature.Feature18StubSix
import com.example.feature18.feature.Feature18StubSixImpl
import com.example.feature18.feature.Feature18StubTen
import com.example.feature18.feature.Feature18StubTenImpl
import com.example.feature18.feature.Feature18StubThree
import com.example.feature18.feature.Feature18StubThreeImpl
import com.example.feature18.feature.Feature18StubTwo
import com.example.feature18.feature.Feature18StubTwoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface Feature18ModuleOne {

    @Binds
    fun bindsFeature18StubOne(impl: Feature18StubOneImpl): Feature18StubOne

    @Binds
    fun bindsFeature18StubTwo(impl: Feature18StubTwoImpl): Feature18StubTwo

    @Binds
    fun bindsFeature18StubThree(impl: Feature18StubThreeImpl): Feature18StubThree

    @Binds
    fun bindsFeature18StubFour(impl: Feature18StubFourImpl): Feature18StubFour

    @Binds
    fun bindsFeature18StubFive(impl: Feature18StubFiveImpl): Feature18StubFive

    @Binds
    fun bindsFeature18StubSix(impl: Feature18StubSixImpl): Feature18StubSix

    @Binds
    fun bindsFeature18StubSeven(impl: Feature18StubSevenImpl): Feature18StubSeven

    @Binds
    fun bindsFeature18StubEight(impl: Feature18StubEightImpl): Feature18StubEight

    @Binds
    fun bindsFeature18StubNine(impl: Feature18StubNineImpl): Feature18StubNine
    @Binds

    fun bindsFeature18StubTen(impl: Feature18StubTenImpl): Feature18StubTen
}