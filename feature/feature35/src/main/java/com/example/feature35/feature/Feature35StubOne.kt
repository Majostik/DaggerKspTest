package com.example.feature35.feature

import javax.inject.Inject

interface Feature35StubOne {

    fun test()
}

class Feature35StubOneImpl @Inject constructor(): Feature35StubOne {

    override fun test() {

    }
}