package com.example.feature18.feature

import javax.inject.Inject

interface Feature18StubFive {

    fun test()
}

class Feature18StubFiveImpl @Inject constructor(): Feature18StubFive {

    override fun test() {

    }
}