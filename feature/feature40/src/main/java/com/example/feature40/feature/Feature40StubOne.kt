package com.example.feature40.feature

import javax.inject.Inject

interface Feature40StubOne {

    fun test()
}

class Feature40StubOneImpl @Inject constructor(): Feature40StubOne {

    override fun test() {

    }
}