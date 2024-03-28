package com.example.feature16.feature

import javax.inject.Inject

interface Feature16StubFour {

    fun test()
}

class Feature16StubFourImpl @Inject constructor(): Feature16StubFour {

    override fun test() {

    }
}