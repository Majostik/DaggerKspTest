package com.example.feature3.feature

import javax.inject.Inject

interface Feature3StubOne {

    fun test()
}

class Feature3StubOneImpl @Inject constructor(): Feature3StubOne {

    override fun test() {

    }
}