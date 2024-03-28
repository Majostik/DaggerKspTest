package com.example.feature16.di.module

import com.example.feature16.feature.Feature16StubEight
import com.example.feature16.feature.Feature16StubEightImpl
import com.example.feature16.feature.Feature16StubFive
import com.example.feature16.feature.Feature16StubFiveImpl
import com.example.feature16.feature.Feature16StubFour
import com.example.feature16.feature.Feature16StubFourImpl
import com.example.feature16.feature.Feature16StubNine
import com.example.feature16.feature.Feature16StubNineImpl
import com.example.feature16.feature.Feature16StubOne
import com.example.feature16.feature.Feature16StubOneImpl
import com.example.feature16.feature.Feature16StubSeven
import com.example.feature16.feature.Feature16StubSevenImpl
import com.example.feature16.feature.Feature16StubSix
import com.example.feature16.feature.Feature16StubSixImpl
import com.example.feature16.feature.Feature16StubTen
import com.example.feature16.feature.Feature16StubTenImpl
import com.example.feature16.feature.Feature16StubThree
import com.example.feature16.feature.Feature16StubThreeImpl
import com.example.feature16.feature.Feature16StubTwo
import com.example.feature16.feature.Feature16StubTwoImpl
import dagger.Binds
import dagger.Module

@Module
interface Feature16ModuleOne {

    @Binds
    fun bindsFeature16StubOne(impl: Feature16StubOneImpl): Feature16StubOne

    @Binds
    fun bindsFeature16StubTwo(impl: Feature16StubTwoImpl): Feature16StubTwo

    @Binds
    fun bindsFeature16StubThree(impl: Feature16StubThreeImpl): Feature16StubThree

    @Binds
    fun bindsFeature16StubFour(impl: Feature16StubFourImpl): Feature16StubFour

    @Binds
    fun bindsFeature16StubFive(impl: Feature16StubFiveImpl): Feature16StubFive

    @Binds
    fun bindsFeature16StubSix(impl: Feature16StubSixImpl): Feature16StubSix

    @Binds
    fun bindsFeature16StubSeven(impl: Feature16StubSevenImpl): Feature16StubSeven

    @Binds
    fun bindsFeature16StubEight(impl: Feature16StubEightImpl): Feature16StubEight

    @Binds
    fun bindsFeature16StubNine(impl: Feature16StubNineImpl): Feature16StubNine
    @Binds

    fun bindsFeature16StubTen(impl: Feature16StubTenImpl): Feature16StubTen
}