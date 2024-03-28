package com.example.feature3.feature

import javax.inject.Inject

interface Feature3StubTen {

    fun test()
}

class Feature3StubTenImpl @Inject constructor(): Feature3StubTen {

    override fun test() {

    }
}