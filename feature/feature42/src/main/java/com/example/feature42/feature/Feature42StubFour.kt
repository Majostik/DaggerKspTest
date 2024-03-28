package com.example.feature42.feature

import javax.inject.Inject

interface Feature42StubFour {

    fun test()
}

class Feature42StubFourImpl @Inject constructor(): Feature42StubFour {

    override fun test() {

    }
}