package com.example.feature15.feature

import javax.inject.Inject

interface Feature15StubFour {

    fun test()
}

class Feature15StubFourImpl @Inject constructor(): Feature15StubFour {

    override fun test() {

    }
}