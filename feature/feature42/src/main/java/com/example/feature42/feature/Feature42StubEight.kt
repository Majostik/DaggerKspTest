package com.example.feature42.feature

import javax.inject.Inject

interface Feature42StubEight {

    fun test()
}

class Feature42StubEightImpl @Inject constructor(): Feature42StubEight {

    override fun test() {

    }
}