package com.example.feature20.feature

import javax.inject.Inject

interface Feature20StubOne {

    fun test()
}

class Feature20StubOneImpl @Inject constructor(): Feature20StubOne {

    override fun test() {

    }
}