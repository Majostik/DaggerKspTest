package com.example.feature16.feature

import javax.inject.Inject

interface Feature16StubNine {

    fun test()
}

class Feature16StubNineImpl @Inject constructor(): Feature16StubNine {

    override fun test() {

    }
}