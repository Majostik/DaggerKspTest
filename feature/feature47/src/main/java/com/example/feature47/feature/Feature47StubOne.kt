package com.example.feature47.feature

import javax.inject.Inject

interface Feature47StubOne {

    fun test()
}

class Feature47StubOneImpl @Inject constructor(): Feature47StubOne {

    override fun test() {

    }
}