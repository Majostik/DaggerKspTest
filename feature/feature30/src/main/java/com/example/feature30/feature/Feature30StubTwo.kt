package com.example.feature30.feature

import javax.inject.Inject

interface Feature30StubTwo {

    fun test()
}

class Feature30StubTwoImpl @Inject constructor(): Feature30StubTwo {

    override fun test() {

    }
}