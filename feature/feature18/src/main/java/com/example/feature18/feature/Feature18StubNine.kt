package com.example.feature18.feature

import javax.inject.Inject

interface Feature18StubNine {

    fun test()
}

class Feature18StubNineImpl @Inject constructor(): Feature18StubNine {

    override fun test() {

    }
}