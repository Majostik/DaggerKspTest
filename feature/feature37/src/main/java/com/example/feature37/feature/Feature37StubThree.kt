package com.example.feature37.feature

import javax.inject.Inject

interface Feature37StubThree {

    fun test()
}

class Feature37StubThreeImpl @Inject constructor(): Feature37StubThree {

    override fun test() {

    }
}