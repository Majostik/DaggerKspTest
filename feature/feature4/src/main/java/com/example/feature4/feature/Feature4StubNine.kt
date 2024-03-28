package com.example.feature4.feature

import javax.inject.Inject

interface Feature4StubNine {

    fun test()
}

class Feature4StubNineImpl @Inject constructor(): Feature4StubNine {

    override fun test() {

    }
}