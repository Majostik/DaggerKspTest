package com.example.feature15.feature

import javax.inject.Inject

interface Feature15StubOne {

    fun test()
}

class Feature15StubOneImpl @Inject constructor(): Feature15StubOne {

    override fun test() {

    }
}