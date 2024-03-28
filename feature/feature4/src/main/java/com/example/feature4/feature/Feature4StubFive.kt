package com.example.feature4.feature

import javax.inject.Inject

interface Feature4StubFive {

    fun test()
}

class Feature4StubFiveImpl @Inject constructor(): Feature4StubFive {

    override fun test() {

    }
}