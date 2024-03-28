package com.example.feature21.feature

import javax.inject.Inject

interface Feature21StubThree {

    fun test()
}

class Feature21StubThreeImpl @Inject constructor(): Feature21StubThree {

    override fun test() {

    }
}