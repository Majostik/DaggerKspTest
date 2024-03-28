package com.example.feature3.feature

import javax.inject.Inject

interface Feature3StubThree {

    fun test()
}

class Feature3StubThreeImpl @Inject constructor(): Feature3StubThree {

    override fun test() {

    }
}