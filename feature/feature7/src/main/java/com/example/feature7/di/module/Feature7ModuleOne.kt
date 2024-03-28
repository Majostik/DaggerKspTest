package com.example.feature7.di.module

import com.example.feature7.feature.Feature7StubEight
import com.example.feature7.feature.Feature7StubEightImpl
import com.example.feature7.feature.Feature7StubFive
import com.example.feature7.feature.Feature7StubFiveImpl
import com.example.feature7.feature.Feature7StubFour
import com.example.feature7.feature.Feature7StubFourImpl
import com.example.feature7.feature.Feature7StubNine
import com.example.feature7.feature.Feature7StubNineImpl
import com.example.feature7.feature.Feature7StubOne
import com.example.feature7.feature.Feature7StubOneImpl
import com.example.feature7.feature.Feature7StubSeven
import com.example.feature7.feature.Feature7StubSevenImpl
import com.example.feature7.feature.Feature7StubSix
import com.example.feature7.feature.Feature7StubSixImpl
import com.example.feature7.feature.Feature7StubTen
import com.example.feature7.feature.Feature7StubTenImpl
import com.example.feature7.feature.Feature7StubThree
import com.example.feature7.feature.Feature7StubThreeImpl
import com.example.feature7.feature.Feature7StubTwo
import com.example.feature7.feature.Feature7StubTwoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface Feature7ModuleOne {

    @Binds
    fun bindsFeature7StubOne(impl: Feature7StubOneImpl): Feature7StubOne

    @Binds
    fun bindsFeature7StubTwo(impl: Feature7StubTwoImpl): Feature7StubTwo

    @Binds
    fun bindsFeature7StubThree(impl: Feature7StubThreeImpl): Feature7StubThree

    @Binds
    fun bindsFeature7StubFour(impl: Feature7StubFourImpl): Feature7StubFour

    @Binds
    fun bindsFeature7StubFive(impl: Feature7StubFiveImpl): Feature7StubFive

    @Binds
    fun bindsFeature7StubSix(impl: Feature7StubSixImpl): Feature7StubSix

    @Binds
    fun bindsFeature7StubSeven(impl: Feature7StubSevenImpl): Feature7StubSeven

    @Binds
    fun bindsFeature7StubEight(impl: Feature7StubEightImpl): Feature7StubEight

    @Binds
    fun bindsFeature7StubNine(impl: Feature7StubNineImpl): Feature7StubNine
    @Binds

    fun bindsFeature7StubTen(impl: Feature7StubTenImpl): Feature7StubTen
}