package com.example.feature42.feature

import javax.inject.Inject

interface Feature42StubSeven {

    fun test()
}

class Feature42StubSevenImpl @Inject constructor(): Feature42StubSeven {

    override fun test() {

    }
}