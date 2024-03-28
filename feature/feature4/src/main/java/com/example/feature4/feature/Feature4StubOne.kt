package com.example.feature4.feature

import javax.inject.Inject

interface Feature4StubOne {

    fun test()
}

class Feature4StubOneImpl @Inject constructor(): Feature4StubOne {

    override fun test() {

    }
}