package com.example.feature_1.feature

import javax.inject.Inject

interface Feature2StubTen {

    fun test()
}

class Feature2StubTenImpl @Inject constructor(): Feature2StubTen {

    override fun test() {

    }
}