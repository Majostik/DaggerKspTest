package com.example.feature30.feature

import javax.inject.Inject

interface Feature30StubFive {

    fun test()
}

class Feature30StubFiveImpl @Inject constructor(): Feature30StubFive {

    override fun test() {

    }
}