package com.example.feature43.feature

import javax.inject.Inject

interface Feature43StubTwo {

    fun test()
}

class Feature43StubTwoImpl @Inject constructor(): Feature43StubTwo {

    override fun test() {

    }
}