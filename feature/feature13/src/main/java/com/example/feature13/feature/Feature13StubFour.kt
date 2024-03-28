package com.example.feature13.feature

import javax.inject.Inject

interface Feature13StubFour {

    fun test()
}

class Feature13StubFourImpl @Inject constructor(): Feature13StubFour {

    override fun test() {

    }
}