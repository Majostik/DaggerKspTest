package com.example.feature35.feature

import javax.inject.Inject

interface Feature35StubThree {

    fun test()
}

class Feature35StubThreeImpl @Inject constructor(): Feature35StubThree {

    override fun test() {

    }
}