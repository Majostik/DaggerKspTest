package com.example.feature35.di.module

import com.example.feature35.feature.Feature35StubEight
import com.example.feature35.feature.Feature35StubEightImpl
import com.example.feature35.feature.Feature35StubFive
import com.example.feature35.feature.Feature35StubFiveImpl
import com.example.feature35.feature.Feature35StubFour
import com.example.feature35.feature.Feature35StubFourImpl
import com.example.feature35.feature.Feature35StubNine
import com.example.feature35.feature.Feature35StubNineImpl
import com.example.feature35.feature.Feature35StubOne
import com.example.feature35.feature.Feature35StubOneImpl
import com.example.feature35.feature.Feature35StubSeven
import com.example.feature35.feature.Feature35StubSevenImpl
import com.example.feature35.feature.Feature35StubSix
import com.example.feature35.feature.Feature35StubSixImpl
import com.example.feature35.feature.Feature35StubTen
import com.example.feature35.feature.Feature35StubTenImpl
import com.example.feature35.feature.Feature35StubThree
import com.example.feature35.feature.Feature35StubThreeImpl
import com.example.feature35.feature.Feature35StubTwo
import com.example.feature35.feature.Feature35StubTwoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface Feature35ModuleOne {

    @Binds
    fun bindsFeature35StubOne(impl: Feature35StubOneImpl): Feature35StubOne

    @Binds
    fun bindsFeature35StubTwo(impl: Feature35StubTwoImpl): Feature35StubTwo

    @Binds
    fun bindsFeature35StubThree(impl: Feature35StubThreeImpl): Feature35StubThree

    @Binds
    fun bindsFeature35StubFour(impl: Feature35StubFourImpl): Feature35StubFour

    @Binds
    fun bindsFeature35StubFive(impl: Feature35StubFiveImpl): Feature35StubFive

    @Binds
    fun bindsFeature35StubSix(impl: Feature35StubSixImpl): Feature35StubSix

    @Binds
    fun bindsFeature35StubSeven(impl: Feature35StubSevenImpl): Feature35StubSeven

    @Binds
    fun bindsFeature35StubEight(impl: Feature35StubEightImpl): Feature35StubEight

    @Binds
    fun bindsFeature35StubNine(impl: Feature35StubNineImpl): Feature35StubNine
    @Binds

    fun bindsFeature35StubTen(impl: Feature35StubTenImpl): Feature35StubTen
}