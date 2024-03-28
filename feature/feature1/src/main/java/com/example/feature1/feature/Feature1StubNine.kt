package com.example.feature1.feature

import javax.inject.Inject

interface Feature1StubNine {

    fun test()
}

class Feature1StubNineImpl @Inject constructor(): Feature1StubNine {

    override fun test() {

    }
}