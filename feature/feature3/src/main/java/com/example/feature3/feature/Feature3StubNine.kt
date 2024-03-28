package com.example.feature3.feature

import javax.inject.Inject

interface Feature3StubNine {

    fun test()
}

class Feature3StubNineImpl @Inject constructor(): Feature3StubNine {

    override fun test() {

    }
}