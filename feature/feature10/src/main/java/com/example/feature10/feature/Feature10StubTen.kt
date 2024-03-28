package com.example.feature10.feature

import javax.inject.Inject

interface Feature10StubTen {

    fun test()
}

class Feature10StubTenImpl @Inject constructor(): Feature10StubTen {

    override fun test() {

    }
}