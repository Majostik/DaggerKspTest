package com.example.feature11.feature

import javax.inject.Inject

interface Feature11StubNine {

    fun test()
}

class Feature11StubNineImpl @Inject constructor(): Feature11StubNine {

    override fun test() {

    }
}