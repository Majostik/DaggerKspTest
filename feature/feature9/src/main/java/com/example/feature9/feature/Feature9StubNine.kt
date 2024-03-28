package com.example.feature9.feature

import javax.inject.Inject

interface Feature9StubNine {

    fun test()
}

class Feature9StubNineImpl @Inject constructor(): Feature9StubNine {

    override fun test() {

    }
}