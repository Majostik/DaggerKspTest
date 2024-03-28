package com.example.testkspproject.di

import com.example.feature1.di.Feature1Dependencies
import com.example.feature10.di.Feature10Dependencies
import com.example.feature11.di.Feature11Dependencies
import com.example.feature12.di.Feature12Dependencies
import com.example.feature13.di.Feature13Dependencies
import com.example.feature14.di.Feature14Dependencies
import com.example.feature15.di.Feature15Dependencies
import com.example.feature16.di.Feature16Dependencies
import com.example.feature17.di.Feature17Dependencies
import com.example.feature18.di.Feature18Dependencies
import com.example.feature19.di.Feature19Dependencies
import com.example.feature2.di.Feature2Dependencies
import com.example.feature20.di.Feature20Dependencies
import com.example.feature21.di.Feature21Dependencies
import com.example.feature22.di.Feature22Dependencies
import com.example.feature23.di.Feature23Dependencies
import com.example.feature24.di.Feature24Dependencies
import com.example.feature25.di.Feature25Dependencies
import com.example.feature26.di.Feature26Dependencies
import com.example.feature27.di.Feature27Dependencies
import com.example.feature28.di.Feature28Dependencies
import com.example.feature29.di.Feature29Dependencies
import com.example.feature3.di.Feature3Dependencies
import com.example.feature30.di.Feature30Dependencies
import com.example.feature31.di.Feature31Dependencies
import com.example.feature32.di.Feature32Dependencies
import com.example.feature33.di.Feature33Dependencies
import com.example.feature34.di.Feature34Dependencies
import com.example.feature35.di.Feature35Dependencies
import com.example.feature36.di.Feature36Dependencies
import com.example.feature37.di.Feature37Dependencies
import com.example.feature38.di.Feature38Dependencies
import com.example.feature39.di.Feature39Dependencies
import com.example.feature4.di.Feature4Dependencies
import com.example.feature40.di.Feature40Dependencies
import com.example.feature41.di.Feature41Dependencies
import com.example.feature42.di.Feature42Dependencies
import com.example.feature43.di.Feature43Dependencies
import com.example.feature44.di.Feature44Dependencies
import com.example.feature45.di.Feature45Dependencies
import com.example.feature46.di.Feature46Dependencies
import com.example.feature47.di.Feature47Dependencies
import com.example.feature48.di.Feature48Dependencies
import com.example.feature49.di.Feature49Dependencies
import com.example.feature5.di.Feature5Dependencies
import com.example.feature50.di.Feature50Dependencies
import com.example.feature6.di.Feature6Dependencies
import com.example.feature7.di.Feature7Dependencies
import com.example.feature8.di.Feature8Dependencies
import com.example.feature9.di.Feature9Dependencies
import com.example.testkspproject.App
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        DependenciesModule::class
    ]
)
interface AppComponent:
    Feature1Dependencies,
    Feature2Dependencies,
    Feature3Dependencies,
    Feature4Dependencies,
    Feature5Dependencies,
    Feature6Dependencies,
    Feature7Dependencies,
    Feature8Dependencies,
    Feature9Dependencies,
    Feature10Dependencies,
    Feature11Dependencies,
    Feature12Dependencies,
    Feature13Dependencies,
    Feature14Dependencies,
    Feature15Dependencies,
    Feature16Dependencies,
    Feature17Dependencies,
    Feature18Dependencies,
    Feature19Dependencies,
    Feature20Dependencies,
    Feature21Dependencies,
    Feature22Dependencies,
    Feature23Dependencies,
    Feature24Dependencies,
    Feature25Dependencies,
    Feature26Dependencies,
    Feature27Dependencies,
    Feature28Dependencies,
    Feature29Dependencies,
    Feature30Dependencies,
    Feature31Dependencies,
    Feature32Dependencies,
    Feature33Dependencies,
    Feature34Dependencies,
    Feature35Dependencies,
    Feature36Dependencies,
    Feature37Dependencies,
    Feature38Dependencies,
    Feature39Dependencies,
    Feature40Dependencies,
    Feature41Dependencies,
    Feature42Dependencies,
    Feature43Dependencies,
    Feature44Dependencies,
    Feature45Dependencies,
    Feature46Dependencies,
    Feature47Dependencies,
    Feature48Dependencies,
    Feature49Dependencies,
    Feature50Dependencies {

    fun inject(app: App)

    @Component.Factory
    interface Factory {

        fun create(@BindsInstance app: App): AppComponent
    }
}