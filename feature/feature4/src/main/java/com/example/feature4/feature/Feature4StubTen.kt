package com.example.feature4.feature

import javax.inject.Inject

interface Feature4StubTen {

    fun test()
}

class Feature4StubTenImpl @Inject constructor(): Feature4StubTen {

    override fun test() {

    }
}