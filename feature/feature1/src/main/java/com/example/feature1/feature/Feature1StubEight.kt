package com.example.feature1.feature

import javax.inject.Inject

interface Feature1StubEight {

    fun test()
}

class Feature1StubEightImpl @Inject constructor(): Feature1StubEight {

    override fun test() {

    }
}