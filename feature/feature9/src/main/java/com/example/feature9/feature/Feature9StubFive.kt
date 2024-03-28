package com.example.feature9.feature

import javax.inject.Inject

interface Feature9StubFive {

    fun test()
}

class Feature9StubFiveImpl @Inject constructor(): Feature9StubFive {

    override fun test() {

    }
}