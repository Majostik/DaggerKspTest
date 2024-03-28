package com.example.feature42.feature

import javax.inject.Inject

interface Feature42StubTen {

    fun test()
}

class Feature42StubTenImpl @Inject constructor(): Feature42StubTen {

    override fun test() {

    }
}