package com.example.feature38.feature

import javax.inject.Inject

interface Feature38StubTwo {

    fun test()
}

class Feature38StubTwoImpl @Inject constructor(): Feature38StubTwo {

    override fun test() {

    }
}