package com.example.feature2.feature

import javax.inject.Inject

interface Feature2StubFive {

    fun test()
}

class Feature2StubFiveImpl @Inject constructor(): Feature2StubFive {

    override fun test() {

    }
}