package com.example.feature25.feature

import javax.inject.Inject

interface Feature25StubOne {

    fun test()
}

class Feature25StubOneImpl @Inject constructor(): Feature25StubOne {

    override fun test() {

    }
}