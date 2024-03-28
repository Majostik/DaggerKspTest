package com.example.feature_1.feature

import javax.inject.Inject

interface Feature1StubOne {

    fun test()
}

class Feature1StubOneImpl @Inject constructor(): Feature1StubOne {

    override fun test() {

    }
}