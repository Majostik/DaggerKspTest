package com.example.feature32.feature

import javax.inject.Inject

interface Feature32StubFour {

    fun test()
}

class Feature32StubFourImpl @Inject constructor(): Feature32StubFour {

    override fun test() {

    }
}