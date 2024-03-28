package com.example.feature41.feature

import javax.inject.Inject

interface Feature41StubOne {

    fun test()
}

class Feature41StubOneImpl @Inject constructor(): Feature41StubOne {

    override fun test() {

    }
}