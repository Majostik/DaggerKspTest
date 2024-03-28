package com.example.feature6.feature

import javax.inject.Inject

interface Feature6StubFour {

    fun test()
}

class Feature6StubFourImpl @Inject constructor(): Feature6StubFour {

    override fun test() {

    }
}