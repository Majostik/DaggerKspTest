package com.example.feature46.di.module

import com.example.feature46.feature.Feature46StubEight
import com.example.feature46.feature.Feature46StubEightImpl
import com.example.feature46.feature.Feature46StubFive
import com.example.feature46.feature.Feature46StubFiveImpl
import com.example.feature46.feature.Feature46StubFour
import com.example.feature46.feature.Feature46StubFourImpl
import com.example.feature46.feature.Feature46StubNine
import com.example.feature46.feature.Feature46StubNineImpl
import com.example.feature46.feature.Feature46StubOne
import com.example.feature46.feature.Feature46StubOneImpl
import com.example.feature46.feature.Feature46StubSeven
import com.example.feature46.feature.Feature46StubSevenImpl
import com.example.feature46.feature.Feature46StubSix
import com.example.feature46.feature.Feature46StubSixImpl
import com.example.feature46.feature.Feature46StubTen
import com.example.feature46.feature.Feature46StubTenImpl
import com.example.feature46.feature.Feature46StubThree
import com.example.feature46.feature.Feature46StubThreeImpl
import com.example.feature46.feature.Feature46StubTwo
import com.example.feature46.feature.Feature46StubTwoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface Feature46ModuleOne {

    @Binds
    fun bindsFeature46StubOne(impl: Feature46StubOneImpl): Feature46StubOne

    @Binds
    fun bindsFeature46StubTwo(impl: Feature46StubTwoImpl): Feature46StubTwo

    @Binds
    fun bindsFeature46StubThree(impl: Feature46StubThreeImpl): Feature46StubThree

    @Binds
    fun bindsFeature46StubFour(impl: Feature46StubFourImpl): Feature46StubFour

    @Binds
    fun bindsFeature46StubFive(impl: Feature46StubFiveImpl): Feature46StubFive

    @Binds
    fun bindsFeature46StubSix(impl: Feature46StubSixImpl): Feature46StubSix

    @Binds
    fun bindsFeature46StubSeven(impl: Feature46StubSevenImpl): Feature46StubSeven

    @Binds
    fun bindsFeature46StubEight(impl: Feature46StubEightImpl): Feature46StubEight

    @Binds
    fun bindsFeature46StubNine(impl: Feature46StubNineImpl): Feature46StubNine
    @Binds

    fun bindsFeature46StubTen(impl: Feature46StubTenImpl): Feature46StubTen
}