package com.example.feature30.feature

import javax.inject.Inject

interface Feature30StubOne {

    fun test()
}

class Feature30StubOneImpl @Inject constructor(): Feature30StubOne {

    override fun test() {

    }
}