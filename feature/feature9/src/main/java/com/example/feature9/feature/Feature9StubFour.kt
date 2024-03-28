package com.example.feature9.feature

import javax.inject.Inject

interface Feature9StubFour {

    fun test()
}

class Feature9StubFourImpl @Inject constructor(): Feature9StubFour {

    override fun test() {

    }
}