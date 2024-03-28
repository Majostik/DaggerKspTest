package com.example.feature11.feature

import javax.inject.Inject

interface Feature11StubFour {

    fun test()
}

class Feature11StubFourImpl @Inject constructor(): Feature11StubFour {

    override fun test() {

    }
}