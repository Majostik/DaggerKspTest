package com.example.feature13.feature

import javax.inject.Inject

interface Feature13StubThree {

    fun test()
}

class Feature13StubThreeImpl @Inject constructor(): Feature13StubThree {

    override fun test() {

    }
}