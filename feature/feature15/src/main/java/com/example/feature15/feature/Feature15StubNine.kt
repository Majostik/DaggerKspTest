package com.example.feature15.feature

import javax.inject.Inject

interface Feature15StubNine {

    fun test()
}

class Feature15StubNineImpl @Inject constructor(): Feature15StubNine {

    override fun test() {

    }
}