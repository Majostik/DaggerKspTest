package com.example.feature15.feature

import javax.inject.Inject

interface Feature15StubTwo {

    fun test()
}

class Feature15StubTwoImpl @Inject constructor(): Feature15StubTwo {

    override fun test() {

    }
}