package com.example.feature15.feature

import javax.inject.Inject

interface Feature15StubTen {

    fun test()
}

class Feature15StubTenImpl @Inject constructor(): Feature15StubTen {

    override fun test() {

    }
}