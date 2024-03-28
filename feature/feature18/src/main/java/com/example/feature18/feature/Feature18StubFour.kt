package com.example.feature18.feature

import javax.inject.Inject

interface Feature18StubFour {

    fun test()
}

class Feature18StubFourImpl @Inject constructor(): Feature18StubFour {

    override fun test() {

    }
}