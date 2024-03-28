package com.example.feature20.feature

import javax.inject.Inject

interface Feature20StubFive {

    fun test()
}

class Feature20StubFiveImpl @Inject constructor(): Feature20StubFive {

    override fun test() {

    }
}