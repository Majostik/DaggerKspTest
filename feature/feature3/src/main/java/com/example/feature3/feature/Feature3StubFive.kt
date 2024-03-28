package com.example.feature3.feature

import javax.inject.Inject

interface Feature3StubFive {

    fun test()
}

class Feature3StubFiveImpl @Inject constructor(): Feature3StubFive {

    override fun test() {

    }
}