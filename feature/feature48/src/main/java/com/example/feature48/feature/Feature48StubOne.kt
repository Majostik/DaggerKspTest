package com.example.feature48.feature

import javax.inject.Inject

interface Feature48StubOne {

    fun test()
}

class Feature48StubOneImpl @Inject constructor(): Feature48StubOne {

    override fun test() {

    }
}