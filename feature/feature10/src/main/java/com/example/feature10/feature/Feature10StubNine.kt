package com.example.feature10.feature

import javax.inject.Inject

interface Feature10StubNine {

    fun test()
}

class Feature10StubNineImpl @Inject constructor(): Feature10StubNine {

    override fun test() {

    }
}