package com.example.feature3.feature

import javax.inject.Inject

interface Feature3StubEight {

    fun test()
}

class Feature3StubEightImpl @Inject constructor(): Feature3StubEight {

    override fun test() {

    }
}