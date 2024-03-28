package com.example.feature50.feature

import javax.inject.Inject

interface Feature50StubOne {

    fun test()
}

class Feature50StubOneImpl @Inject constructor(): Feature50StubOne {

    override fun test() {

    }
}