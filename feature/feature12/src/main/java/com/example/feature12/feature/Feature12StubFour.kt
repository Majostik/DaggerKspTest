package com.example.feature12.feature

import javax.inject.Inject

interface Feature12StubFour {

    fun test()
}

class Feature12StubFourImpl @Inject constructor(): Feature12StubFour {

    override fun test() {

    }
}