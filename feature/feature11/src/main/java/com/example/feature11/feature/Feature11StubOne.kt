package com.example.feature11.feature

import javax.inject.Inject

interface Feature11StubOne {

    fun test()
}

class Feature11StubOneImpl @Inject constructor(): Feature11StubOne {

    override fun test() {

    }
}