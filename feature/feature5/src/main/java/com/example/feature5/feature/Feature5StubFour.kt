package com.example.feature5.feature

import javax.inject.Inject

interface Feature5StubFour {

    fun test()
}

class Feature5StubFourImpl @Inject constructor(): Feature5StubFour {

    override fun test() {

    }
}