package com.example.feature17.feature

import javax.inject.Inject

interface Feature17StubNine {

    fun test()
}

class Feature17StubNineImpl @Inject constructor(): Feature17StubNine {

    override fun test() {

    }
}