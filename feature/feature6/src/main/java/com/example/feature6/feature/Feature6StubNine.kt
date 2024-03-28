package com.example.feature6.feature

import javax.inject.Inject

interface Feature6StubNine {

    fun test()
}

class Feature6StubNineImpl @Inject constructor(): Feature6StubNine {

    override fun test() {

    }
}