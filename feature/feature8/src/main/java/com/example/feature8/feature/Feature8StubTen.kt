package com.example.feature8.feature

import javax.inject.Inject

interface Feature8StubTen {

    fun test()
}

class Feature8StubTenImpl @Inject constructor(): Feature8StubTen {

    override fun test() {

    }
}