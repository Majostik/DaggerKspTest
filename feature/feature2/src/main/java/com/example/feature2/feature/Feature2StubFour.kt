package com.example.feature2.feature

import javax.inject.Inject

interface Feature2StubFour {

    fun test()
}

class Feature2StubFourImpl @Inject constructor(): Feature2StubFour {

    override fun test() {

    }
}