package com.example.feature10.feature

import javax.inject.Inject

interface Feature10StubOne {

    fun test()
}

class Feature10StubOneImpl @Inject constructor(): Feature10StubOne {

    override fun test() {

    }
}