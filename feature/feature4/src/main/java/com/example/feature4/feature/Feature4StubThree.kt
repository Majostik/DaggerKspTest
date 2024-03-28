package com.example.feature4.feature

import javax.inject.Inject

interface Feature4StubThree {

    fun test()
}

class Feature4StubThreeImpl @Inject constructor(): Feature4StubThree {

    override fun test() {

    }
}