package com.example.feature1.feature

import javax.inject.Inject

interface Feature1StubFive {

    fun test()
}

class Feature1StubFiveImpl @Inject constructor(): Feature1StubFive {

    override fun test() {

    }
}