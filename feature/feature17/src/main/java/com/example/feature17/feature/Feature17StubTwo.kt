package com.example.feature17.feature

import javax.inject.Inject

interface Feature17StubTwo {

    fun test()
}

class Feature17StubTwoImpl @Inject constructor(): Feature17StubTwo {

    override fun test() {

    }
}