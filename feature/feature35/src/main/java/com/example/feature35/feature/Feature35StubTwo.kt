package com.example.feature35.feature

import javax.inject.Inject

interface Feature35StubTwo {

    fun test()
}

class Feature35StubTwoImpl @Inject constructor(): Feature35StubTwo {

    override fun test() {

    }
}