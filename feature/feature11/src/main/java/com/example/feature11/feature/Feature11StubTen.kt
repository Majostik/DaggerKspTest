package com.example.feature11.feature

import javax.inject.Inject

interface Feature11StubTen {

    fun test()
}

class Feature11StubTenImpl @Inject constructor(): Feature11StubTen {

    override fun test() {

    }
}