package com.example.feature15.feature

import javax.inject.Inject

interface Feature15StubThree {

    fun test()
}

class Feature15StubThreeImpl @Inject constructor(): Feature15StubThree {

    override fun test() {

    }
}