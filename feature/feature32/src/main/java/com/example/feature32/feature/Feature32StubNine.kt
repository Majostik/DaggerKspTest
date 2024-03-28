package com.example.feature32.feature

import javax.inject.Inject

interface Feature32StubNine {

    fun test()
}

class Feature32StubNineImpl @Inject constructor(): Feature32StubNine {

    override fun test() {

    }
}