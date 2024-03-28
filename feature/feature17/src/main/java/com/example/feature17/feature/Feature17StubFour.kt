package com.example.feature17.feature

import javax.inject.Inject

interface Feature17StubFour {

    fun test()
}

class Feature17StubFourImpl @Inject constructor(): Feature17StubFour {

    override fun test() {

    }
}