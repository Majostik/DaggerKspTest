package com.example.feature24.feature

import javax.inject.Inject

interface Feature24StubOne {

    fun test()
}

class Feature24StubOneImpl @Inject constructor(): Feature24StubOne {

    override fun test() {

    }
}