package com.example.feature37.feature

import javax.inject.Inject

interface Feature37StubOne {

    fun test()
}

class Feature37StubOneImpl @Inject constructor(): Feature37StubOne {

    override fun test() {

    }
}