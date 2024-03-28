package com.example.feature20.di.module

import com.example.feature20.feature.Feature20StubEight
import com.example.feature20.feature.Feature20StubEightImpl
import com.example.feature20.feature.Feature20StubFive
import com.example.feature20.feature.Feature20StubFiveImpl
import com.example.feature20.feature.Feature20StubFour
import com.example.feature20.feature.Feature20StubFourImpl
import com.example.feature20.feature.Feature20StubNine
import com.example.feature20.feature.Feature20StubNineImpl
import com.example.feature20.feature.Feature20StubOne
import com.example.feature20.feature.Feature20StubOneImpl
import com.example.feature20.feature.Feature20StubSeven
import com.example.feature20.feature.Feature20StubSevenImpl
import com.example.feature20.feature.Feature20StubSix
import com.example.feature20.feature.Feature20StubSixImpl
import com.example.feature20.feature.Feature20StubTen
import com.example.feature20.feature.Feature20StubTenImpl
import com.example.feature20.feature.Feature20StubThree
import com.example.feature20.feature.Feature20StubThreeImpl
import com.example.feature20.feature.Feature20StubTwo
import com.example.feature20.feature.Feature20StubTwoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface Feature20ModuleOne {

    @Binds
    fun bindsFeature20StubOne(impl: Feature20StubOneImpl): Feature20StubOne

    @Binds
    fun bindsFeature20StubTwo(impl: Feature20StubTwoImpl): Feature20StubTwo

    @Binds
    fun bindsFeature20StubThree(impl: Feature20StubThreeImpl): Feature20StubThree

    @Binds
    fun bindsFeature20StubFour(impl: Feature20StubFourImpl): Feature20StubFour

    @Binds
    fun bindsFeature20StubFive(impl: Feature20StubFiveImpl): Feature20StubFive

    @Binds
    fun bindsFeature20StubSix(impl: Feature20StubSixImpl): Feature20StubSix

    @Binds
    fun bindsFeature20StubSeven(impl: Feature20StubSevenImpl): Feature20StubSeven

    @Binds
    fun bindsFeature20StubEight(impl: Feature20StubEightImpl): Feature20StubEight

    @Binds
    fun bindsFeature20StubNine(impl: Feature20StubNineImpl): Feature20StubNine
    @Binds

    fun bindsFeature20StubTen(impl: Feature20StubTenImpl): Feature20StubTen
}