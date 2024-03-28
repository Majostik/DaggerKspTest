package com.example.feature42.feature

import javax.inject.Inject

interface Feature42StubTwo {

    fun test()
}

class Feature42StubTwoImpl @Inject constructor(): Feature42StubTwo {

    override fun test() {

    }
}