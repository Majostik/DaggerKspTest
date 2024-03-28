package com.example.feature_1.feature

import javax.inject.Inject

interface Feature2StubEight {

    fun test()
}

class Feature2StubEightImpl @Inject constructor(): Feature2StubEight {

    override fun test() {

    }
}