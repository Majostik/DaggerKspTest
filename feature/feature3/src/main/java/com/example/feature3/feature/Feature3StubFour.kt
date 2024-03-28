package com.example.feature3.feature

import javax.inject.Inject

interface Feature3StubFour {

    fun test()
}

class Feature3StubFourImpl @Inject constructor(): Feature3StubFour {

    override fun test() {

    }
}