package com.example.feature1.feature

import javax.inject.Inject

interface Feature1StubSeven {

    fun test()
}

class Feature1StubSevenImpl @Inject constructor(): Feature1StubSeven {

    override fun test() {

    }
}