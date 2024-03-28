package com.example.feature46.feature

import javax.inject.Inject

interface Feature46StubOne {

    fun test()
}

class Feature46StubOneImpl @Inject constructor(): Feature46StubOne {

    override fun test() {

    }
}