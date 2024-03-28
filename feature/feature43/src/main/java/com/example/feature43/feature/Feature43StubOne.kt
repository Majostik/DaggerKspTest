package com.example.feature43.feature

import javax.inject.Inject

interface Feature43StubOne {

    fun test()
}

class Feature43StubOneImpl @Inject constructor(): Feature43StubOne {

    override fun test() {

    }
}