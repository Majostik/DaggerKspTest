package com.example.feature11.feature

import javax.inject.Inject

interface Feature11StubTwo {

    fun test()
}

class Feature11StubTwoImpl @Inject constructor(): Feature11StubTwo {

    override fun test() {

    }
}