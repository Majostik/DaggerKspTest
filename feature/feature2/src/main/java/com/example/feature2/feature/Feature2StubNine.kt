package com.example.feature2.feature

import javax.inject.Inject

interface Feature2StubNine {

    fun test()
}

class Feature2StubNineImpl @Inject constructor(): Feature2StubNine {

    override fun test() {

    }
}