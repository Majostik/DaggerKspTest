package com.example.feature12.di.module

import com.example.feature12.feature.Feature12StubEight
import com.example.feature12.feature.Feature12StubEightImpl
import com.example.feature12.feature.Feature12StubFive
import com.example.feature12.feature.Feature12StubFiveImpl
import com.example.feature12.feature.Feature12StubFour
import com.example.feature12.feature.Feature12StubFourImpl
import com.example.feature12.feature.Feature12StubNine
import com.example.feature12.feature.Feature12StubNineImpl
import com.example.feature12.feature.Feature12StubOne
import com.example.feature12.feature.Feature12StubOneImpl
import com.example.feature12.feature.Feature12StubSeven
import com.example.feature12.feature.Feature12StubSevenImpl
import com.example.feature12.feature.Feature12StubSix
import com.example.feature12.feature.Feature12StubSixImpl
import com.example.feature12.feature.Feature12StubTen
import com.example.feature12.feature.Feature12StubTenImpl
import com.example.feature12.feature.Feature12StubThree
import com.example.feature12.feature.Feature12StubThreeImpl
import com.example.feature12.feature.Feature12StubTwo
import com.example.feature12.feature.Feature12StubTwoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface Feature12ModuleOne {

    @Binds
    fun bindsFeature12StubOne(impl: Feature12StubOneImpl): Feature12StubOne

    @Binds
    fun bindsFeature12StubTwo(impl: Feature12StubTwoImpl): Feature12StubTwo

    @Binds
    fun bindsFeature12StubThree(impl: Feature12StubThreeImpl): Feature12StubThree

    @Binds
    fun bindsFeature12StubFour(impl: Feature12StubFourImpl): Feature12StubFour

    @Binds
    fun bindsFeature12StubFive(impl: Feature12StubFiveImpl): Feature12StubFive

    @Binds
    fun bindsFeature12StubSix(impl: Feature12StubSixImpl): Feature12StubSix

    @Binds
    fun bindsFeature12StubSeven(impl: Feature12StubSevenImpl): Feature12StubSeven

    @Binds
    fun bindsFeature12StubEight(impl: Feature12StubEightImpl): Feature12StubEight

    @Binds
    fun bindsFeature12StubNine(impl: Feature12StubNineImpl): Feature12StubNine
    @Binds

    fun bindsFeature12StubTen(impl: Feature12StubTenImpl): Feature12StubTen
}