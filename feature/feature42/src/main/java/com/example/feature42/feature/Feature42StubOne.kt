package com.example.feature42.feature

import javax.inject.Inject

interface Feature42StubOne {

    fun test()
}

class Feature42StubOneImpl @Inject constructor(): Feature42StubOne {

    override fun test() {

    }
}