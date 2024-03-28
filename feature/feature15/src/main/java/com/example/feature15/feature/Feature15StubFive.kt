package com.example.feature15.feature

import javax.inject.Inject

interface Feature15StubFive {

    fun test()
}

class Feature15StubFiveImpl @Inject constructor(): Feature15StubFive {

    override fun test() {

    }
}