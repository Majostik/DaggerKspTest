package com.example.feature5.feature

import javax.inject.Inject

interface Feature5StubNine {

    fun test()
}

class Feature5StubNineImpl @Inject constructor(): Feature5StubNine {

    override fun test() {

    }
}