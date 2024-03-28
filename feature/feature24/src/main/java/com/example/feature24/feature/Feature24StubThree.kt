package com.example.feature24.feature

import javax.inject.Inject

interface Feature24StubThree {

    fun test()
}

class Feature24StubThreeImpl @Inject constructor(): Feature24StubThree {

    override fun test() {

    }
}