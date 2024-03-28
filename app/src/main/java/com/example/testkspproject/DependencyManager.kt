package com.example.testkspproject

import com.example.core.ComponentDependencies
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
import com.example.testkspproject.di.AppEntryPoint

object DependenciesManager {

    fun getDependencies(appEntryPoint: AppEntryPoint): Map<Class<out ComponentDependencies>, @JvmSuppressWildcards ComponentDependencies> {
        return buildMap<Class<out ComponentDependencies>, @JvmSuppressWildcards ComponentDependencies> {
            this[Feature1Dependencies::class.java] = appEntryPoint
            this[Feature2Dependencies::class.java] = appEntryPoint
            this[Feature3Dependencies::class.java] = appEntryPoint
            this[Feature4Dependencies::class.java] = appEntryPoint
            this[Feature5Dependencies::class.java] = appEntryPoint
            this[Feature6Dependencies::class.java] = appEntryPoint
            this[Feature7Dependencies::class.java] = appEntryPoint
            this[Feature8Dependencies::class.java] = appEntryPoint
            this[Feature9Dependencies::class.java] = appEntryPoint
            this[Feature10Dependencies::class.java] = appEntryPoint
            this[Feature11Dependencies::class.java] = appEntryPoint
            this[Feature12Dependencies::class.java] = appEntryPoint
            this[Feature13Dependencies::class.java] = appEntryPoint
            this[Feature14Dependencies::class.java] = appEntryPoint
            this[Feature15Dependencies::class.java] = appEntryPoint
            this[Feature16Dependencies::class.java] = appEntryPoint
            this[Feature17Dependencies::class.java] = appEntryPoint
            this[Feature18Dependencies::class.java] = appEntryPoint
            this[Feature19Dependencies::class.java] = appEntryPoint
            this[Feature20Dependencies::class.java] = appEntryPoint
            this[Feature21Dependencies::class.java] = appEntryPoint
            this[Feature22Dependencies::class.java] = appEntryPoint
            this[Feature23Dependencies::class.java] = appEntryPoint
            this[Feature24Dependencies::class.java] = appEntryPoint
            this[Feature25Dependencies::class.java] = appEntryPoint
            this[Feature26Dependencies::class.java] = appEntryPoint
            this[Feature27Dependencies::class.java] = appEntryPoint
            this[Feature28Dependencies::class.java] = appEntryPoint
            this[Feature29Dependencies::class.java] = appEntryPoint
            this[Feature30Dependencies::class.java] = appEntryPoint
            this[Feature31Dependencies::class.java] = appEntryPoint
            this[Feature32Dependencies::class.java] = appEntryPoint
            this[Feature33Dependencies::class.java] = appEntryPoint
            this[Feature34Dependencies::class.java] = appEntryPoint
            this[Feature35Dependencies::class.java] = appEntryPoint
            this[Feature36Dependencies::class.java] = appEntryPoint
            this[Feature37Dependencies::class.java] = appEntryPoint
            this[Feature38Dependencies::class.java] = appEntryPoint
            this[Feature39Dependencies::class.java] = appEntryPoint
            this[Feature40Dependencies::class.java] = appEntryPoint
            this[Feature41Dependencies::class.java] = appEntryPoint
            this[Feature42Dependencies::class.java] = appEntryPoint
            this[Feature43Dependencies::class.java] = appEntryPoint
            this[Feature44Dependencies::class.java] = appEntryPoint
            this[Feature45Dependencies::class.java] = appEntryPoint
            this[Feature46Dependencies::class.java] = appEntryPoint
            this[Feature47Dependencies::class.java] = appEntryPoint
            this[Feature48Dependencies::class.java] = appEntryPoint
            this[Feature49Dependencies::class.java] = appEntryPoint
            this[Feature50Dependencies::class.java] = appEntryPoint
        }
    }
}