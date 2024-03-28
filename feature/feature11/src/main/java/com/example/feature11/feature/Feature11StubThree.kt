package com.example.feature11.feature

import javax.inject.Inject

interface Feature11StubThree {

    fun test()
}

class Feature11StubThreeImpl @Inject constructor(): Feature11StubThree {

    override fun test() {

    }
}