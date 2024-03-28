package com.example.feature30.feature

import javax.inject.Inject

interface Feature30StubThree {

    fun test()
}

class Feature30StubThreeImpl @Inject constructor(): Feature30StubThree {

    override fun test() {

    }
}