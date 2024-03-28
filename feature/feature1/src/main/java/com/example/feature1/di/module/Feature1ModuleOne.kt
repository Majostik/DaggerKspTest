package com.example.feature_1.di.module

import com.example.feature_1.feature.Feature1StubEight
import com.example.feature_1.feature.Feature1StubEightImpl
import com.example.feature_1.feature.Feature1StubFive
import com.example.feature_1.feature.Feature1StubFiveImpl
import com.example.feature_1.feature.Feature1StubFour
import com.example.feature_1.feature.Feature1StubFourImpl
import com.example.feature_1.feature.Feature1StubNine
import com.example.feature_1.feature.Feature1StubNineImpl
import com.example.feature_1.feature.Feature1StubOne
import com.example.feature_1.feature.Feature1StubOneImpl
import com.example.feature_1.feature.Feature1StubSeven
import com.example.feature_1.feature.Feature1StubSevenImpl
import com.example.feature_1.feature.Feature1StubSix
import com.example.feature_1.feature.Feature1StubSixImpl
import com.example.feature_1.feature.Feature1StubTen
import com.example.feature_1.feature.Feature1StubTenImpl
import com.example.feature_1.feature.Feature1StubThree
import com.example.feature_1.feature.Feature1StubThreeImpl
import com.example.feature_1.feature.Feature1StubTwo
import com.example.feature_1.feature.Feature1StubTwoImpl
import dagger.Binds
import dagger.Module

@Module
interface Feature1ModuleOne {

    @Binds
    fun bindsFeature1StubOne(impl: Feature1StubOneImpl): Feature1StubOne

    @Binds
    fun bindsFeature1StubTwo(impl: Feature1StubTwoImpl): Feature1StubTwo

    @Binds
    fun bindsFeature1StubThree(impl: Feature1StubThreeImpl): Feature1StubThree

    @Binds
    fun bindsFeature1StubFour(impl: Feature1StubFourImpl): Feature1StubFour

    @Binds
    fun bindsFeature1StubFive(impl: Feature1StubFiveImpl): Feature1StubFive

    @Binds
    fun bindsFeature1StubSix(impl: Feature1StubSixImpl): Feature1StubSix

    @Binds
    fun bindsFeature1StubSeven(impl: Feature1StubSevenImpl): Feature1StubSeven

    @Binds
    fun bindsFeature1StubEight(impl: Feature1StubEightImpl): Feature1StubEight

    @Binds
    fun bindsFeature1StubNine(impl: Feature1StubNineImpl): Feature1StubNine
    @Binds

    fun bindsFeature1StubTen(impl: Feature1StubTenImpl): Feature1StubTen
}