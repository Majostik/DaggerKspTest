package com.example.feature13.feature

import javax.inject.Inject

interface Feature13StubFive {

    fun test()
}

class Feature13StubFiveImpl @Inject constructor(): Feature13StubFive {

    override fun test() {

    }
}