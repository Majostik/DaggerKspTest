package com.example.feature1.feature

import javax.inject.Inject

interface Feature1StubTen {

    fun test()
}

class Feature1StubTenImpl @Inject constructor(): Feature1StubTen {

    override fun test() {

    }
}