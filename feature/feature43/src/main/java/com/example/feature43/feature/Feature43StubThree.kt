package com.example.feature43.feature

import javax.inject.Inject

interface Feature43StubThree {

    fun test()
}

class Feature43StubThreeImpl @Inject constructor(): Feature43StubThree {

    override fun test() {

    }
}