package com.example.feature3.feature

import javax.inject.Inject

interface Feature3StubSeven {

    fun test()
}

class Feature3StubSevenImpl @Inject constructor(): Feature3StubSeven {

    override fun test() {

    }
}