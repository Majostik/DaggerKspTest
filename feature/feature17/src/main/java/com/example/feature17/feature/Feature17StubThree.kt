package com.example.feature17.feature

import javax.inject.Inject

interface Feature17StubThree {

    fun test()
}

class Feature17StubThreeImpl @Inject constructor(): Feature17StubThree {

    override fun test() {

    }
}