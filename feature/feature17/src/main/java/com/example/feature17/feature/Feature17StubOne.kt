package com.example.feature17.feature

import javax.inject.Inject

interface Feature17StubOne {

    fun test()
}

class Feature17StubOneImpl @Inject constructor(): Feature17StubOne {

    override fun test() {

    }
}