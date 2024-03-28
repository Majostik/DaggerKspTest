package com.example.feature13.feature

import javax.inject.Inject

interface Feature13StubOne {

    fun test()
}

class Feature13StubOneImpl @Inject constructor(): Feature13StubOne {

    override fun test() {

    }
}