package com.example.feature42.feature

import javax.inject.Inject

interface Feature42StubNine {

    fun test()
}

class Feature42StubNineImpl @Inject constructor(): Feature42StubNine {

    override fun test() {

    }
}