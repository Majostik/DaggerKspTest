package com.example.feature21.feature

import javax.inject.Inject

interface Feature21StubOne {

    fun test()
}

class Feature21StubOneImpl @Inject constructor(): Feature21StubOne {

    override fun test() {

    }
}