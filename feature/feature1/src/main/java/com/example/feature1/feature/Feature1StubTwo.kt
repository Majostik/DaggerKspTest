package com.example.feature1.feature

import javax.inject.Inject

interface Feature1StubTwo {

    fun test()
}

class Feature1StubTwoImpl @Inject constructor(): Feature1StubTwo {

    override fun test() {

    }
}