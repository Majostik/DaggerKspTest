package com.example.feature4.feature

import javax.inject.Inject

interface Feature4StubFour {

    fun test()
}

class Feature4StubFourImpl @Inject constructor(): Feature4StubFour {

    override fun test() {

    }
}