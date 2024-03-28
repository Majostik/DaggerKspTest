package com.example.feature37.feature

import javax.inject.Inject

interface Feature37StubTwo {

    fun test()
}

class Feature37StubTwoImpl @Inject constructor(): Feature37StubTwo {

    override fun test() {

    }
}