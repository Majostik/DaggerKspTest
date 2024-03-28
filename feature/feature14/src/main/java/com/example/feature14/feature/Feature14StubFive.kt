package com.example.feature14.feature

import javax.inject.Inject

interface Feature14StubFive {

    fun test()
}

class Feature14StubFiveImpl @Inject constructor(): Feature14StubFive {

    override fun test() {

    }
}