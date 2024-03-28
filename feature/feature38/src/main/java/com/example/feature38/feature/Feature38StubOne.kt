package com.example.feature38.feature

import javax.inject.Inject

interface Feature38StubOne {

    fun test()
}

class Feature38StubOneImpl @Inject constructor(): Feature38StubOne {

    override fun test() {

    }
}