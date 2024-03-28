package com.example.feature10.feature

import javax.inject.Inject

interface Feature10StubFour {

    fun test()
}

class Feature10StubFourImpl @Inject constructor(): Feature10StubFour {

    override fun test() {

    }
}