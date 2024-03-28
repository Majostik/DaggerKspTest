package com.example.feature9.feature

import javax.inject.Inject

interface Feature9StubOne {

    fun test()
}

class Feature9StubOneImpl @Inject constructor(): Feature9StubOne {

    override fun test() {

    }
}