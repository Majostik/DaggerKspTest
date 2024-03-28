package com.example.feature3.feature

import javax.inject.Inject

interface Feature3StubTwo {

    fun test()
}

class Feature3StubTwoImpl @Inject constructor(): Feature3StubTwo {

    override fun test() {

    }
}