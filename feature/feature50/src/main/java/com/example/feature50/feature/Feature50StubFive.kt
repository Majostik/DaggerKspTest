package com.example.feature50.feature

import javax.inject.Inject

interface Feature50StubFive {

    fun test()
}

class Feature50StubFiveImpl @Inject constructor(): Feature50StubFive {

    override fun test() {

    }
}