package com.example.feature42.feature

import javax.inject.Inject

interface Feature42StubThree {

    fun test()
}

class Feature42StubThreeImpl @Inject constructor(): Feature42StubThree {

    override fun test() {

    }
}