package com.example.feature_1.feature

import javax.inject.Inject

interface Feature1StubFour {

    fun test()
}

class Feature1StubFourImpl @Inject constructor(): Feature1StubFour {

    override fun test() {

    }
}