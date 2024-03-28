package com.example.feature20.feature

import javax.inject.Inject

interface Feature20StubFour {

    fun test()
}

class Feature20StubFourImpl @Inject constructor(): Feature20StubFour {

    override fun test() {

    }
}