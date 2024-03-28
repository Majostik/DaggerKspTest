package com.example.feature2.feature

import javax.inject.Inject

interface Feature2StubSeven {

    fun test()
}

class Feature2StubSevenImpl @Inject constructor(): Feature2StubSeven {

    override fun test() {

    }
}