package com.example.feature1.feature

import javax.inject.Inject

interface Feature1StubThree {

    fun test()
}

class Feature1StubThreeImpl @Inject constructor(): Feature1StubThree {

    override fun test() {

    }
}