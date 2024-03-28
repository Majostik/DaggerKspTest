package com.example.feature9.feature

import javax.inject.Inject

interface Feature9StubThree {

    fun test()
}

class Feature9StubThreeImpl @Inject constructor(): Feature9StubThree {

    override fun test() {

    }
}