package com.example.feature17.feature

import javax.inject.Inject

interface Feature17StubFive {

    fun test()
}

class Feature17StubFiveImpl @Inject constructor(): Feature17StubFive {

    override fun test() {

    }
}