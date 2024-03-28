package com.example.feature39.feature

import javax.inject.Inject

interface Feature39StubThree {

    fun test()
}

class Feature39StubThreeImpl @Inject constructor(): Feature39StubThree {

    override fun test() {

    }
}