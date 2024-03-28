package com.example.feature25.feature

import javax.inject.Inject

interface Feature25StubFour {

    fun test()
}

class Feature25StubFourImpl @Inject constructor(): Feature25StubFour {

    override fun test() {

    }
}