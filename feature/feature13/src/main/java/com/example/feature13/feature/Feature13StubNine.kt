package com.example.feature13.feature

import javax.inject.Inject

interface Feature13StubNine {

    fun test()
}

class Feature13StubNineImpl @Inject constructor(): Feature13StubNine {

    override fun test() {

    }
}