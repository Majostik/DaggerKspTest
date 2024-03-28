package com.example.feature8.feature

import javax.inject.Inject

interface Feature8StubFour {

    fun test()
}

class Feature8StubFourImpl @Inject constructor(): Feature8StubFour {

    override fun test() {

    }
}