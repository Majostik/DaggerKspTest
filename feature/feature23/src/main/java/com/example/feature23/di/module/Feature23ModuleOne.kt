package com.example.feature23.di.module

import com.example.feature23.feature.Feature23StubEight
import com.example.feature23.feature.Feature23StubEightImpl
import com.example.feature23.feature.Feature23StubFive
import com.example.feature23.feature.Feature23StubFiveImpl
import com.example.feature23.feature.Feature23StubFour
import com.example.feature23.feature.Feature23StubFourImpl
import com.example.feature23.feature.Feature23StubNine
import com.example.feature23.feature.Feature23StubNineImpl
import com.example.feature23.feature.Feature23StubOne
import com.example.feature23.feature.Feature23StubOneImpl
import com.example.feature23.feature.Feature23StubSeven
import com.example.feature23.feature.Feature23StubSevenImpl
import com.example.feature23.feature.Feature23StubSix
import com.example.feature23.feature.Feature23StubSixImpl
import com.example.feature23.feature.Feature23StubTen
import com.example.feature23.feature.Feature23StubTenImpl
import com.example.feature23.feature.Feature23StubThree
import com.example.feature23.feature.Feature23StubThreeImpl
import com.example.feature23.feature.Feature23StubTwo
import com.example.feature23.feature.Feature23StubTwoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface Feature23ModuleOne {

    @Binds
    fun bindsFeature23StubOne(impl: Feature23StubOneImpl): Feature23StubOne

    @Binds
    fun bindsFeature23StubTwo(impl: Feature23StubTwoImpl): Feature23StubTwo

    @Binds
    fun bindsFeature23StubThree(impl: Feature23StubThreeImpl): Feature23StubThree

    @Binds
    fun bindsFeature23StubFour(impl: Feature23StubFourImpl): Feature23StubFour

    @Binds
    fun bindsFeature23StubFive(impl: Feature23StubFiveImpl): Feature23StubFive

    @Binds
    fun bindsFeature23StubSix(impl: Feature23StubSixImpl): Feature23StubSix

    @Binds
    fun bindsFeature23StubSeven(impl: Feature23StubSevenImpl): Feature23StubSeven

    @Binds
    fun bindsFeature23StubEight(impl: Feature23StubEightImpl): Feature23StubEight

    @Binds
    fun bindsFeature23StubNine(impl: Feature23StubNineImpl): Feature23StubNine
    @Binds

    fun bindsFeature23StubTen(impl: Feature23StubTenImpl): Feature23StubTen
}