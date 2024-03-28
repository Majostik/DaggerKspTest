package com.example.feature11.feature

import javax.inject.Inject

interface Feature11StubFive {

    fun test()
}

class Feature11StubFiveImpl @Inject constructor(): Feature11StubFive {

    override fun test() {

    }
}