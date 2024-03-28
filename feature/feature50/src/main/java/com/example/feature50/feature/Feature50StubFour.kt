package com.example.feature50.feature

import javax.inject.Inject

interface Feature50StubFour {

    fun test()
}

class Feature50StubFourImpl @Inject constructor(): Feature50StubFour {

    override fun test() {

    }
}