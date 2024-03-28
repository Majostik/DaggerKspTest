package com.example.feature9.feature

import javax.inject.Inject

interface Feature9StubTwo {

    fun test()
}

class Feature9StubTwoImpl @Inject constructor(): Feature9StubTwo {

    override fun test() {

    }
}