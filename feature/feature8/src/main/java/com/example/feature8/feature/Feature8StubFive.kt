package com.example.feature8.feature

import javax.inject.Inject

interface Feature8StubFive {

    fun test()
}

class Feature8StubFiveImpl @Inject constructor(): Feature8StubFive {

    override fun test() {

    }
}