package com.example.feature13.feature

import javax.inject.Inject

interface Feature13StubTwo {

    fun test()
}

class Feature13StubTwoImpl @Inject constructor(): Feature13StubTwo {

    override fun test() {

    }
}