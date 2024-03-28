package com.example.feature29.feature

import javax.inject.Inject

interface Feature29StubOne {

    fun test()
}

class Feature29StubOneImpl @Inject constructor(): Feature29StubOne {

    override fun test() {

    }
}