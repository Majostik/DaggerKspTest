package com.example.feature21.feature

import javax.inject.Inject

interface Feature21StubTwo {

    fun test()
}

class Feature21StubTwoImpl @Inject constructor(): Feature21StubTwo {

    override fun test() {

    }
}