package com.example.feature39.feature

import javax.inject.Inject

interface Feature39StubOne {

    fun test()
}

class Feature39StubOneImpl @Inject constructor(): Feature39StubOne {

    override fun test() {

    }
}