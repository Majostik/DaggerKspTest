package com.example.feature38.feature

import javax.inject.Inject

interface Feature38StubThree {

    fun test()
}

class Feature38StubThreeImpl @Inject constructor(): Feature38StubThree {

    override fun test() {

    }
}