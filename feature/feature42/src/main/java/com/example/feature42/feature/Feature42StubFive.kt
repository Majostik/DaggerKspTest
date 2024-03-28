package com.example.feature42.feature

import javax.inject.Inject

interface Feature42StubFive {

    fun test()
}

class Feature42StubFiveImpl @Inject constructor(): Feature42StubFive {

    override fun test() {

    }
}