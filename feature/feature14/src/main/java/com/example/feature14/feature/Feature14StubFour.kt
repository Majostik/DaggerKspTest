package com.example.feature14.feature

import javax.inject.Inject

interface Feature14StubFour {

    fun test()
}

class Feature14StubFourImpl @Inject constructor(): Feature14StubFour {

    override fun test() {

    }
}