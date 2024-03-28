package com.example.feature18.feature

import javax.inject.Inject

interface Feature18StubOne {

    fun test()
}

class Feature18StubOneImpl @Inject constructor(): Feature18StubOne {

    override fun test() {

    }
}