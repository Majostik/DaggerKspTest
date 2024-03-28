package com.example.feature23.feature

import javax.inject.Inject

interface Feature23StubNine {

    fun test()
}

class Feature23StubNineImpl @Inject constructor(): Feature23StubNine {

    override fun test() {

    }
}