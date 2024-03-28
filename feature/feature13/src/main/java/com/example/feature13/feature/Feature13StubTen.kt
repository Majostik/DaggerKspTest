package com.example.feature13.feature

import javax.inject.Inject

interface Feature13StubTen {

    fun test()
}

class Feature13StubTenImpl @Inject constructor(): Feature13StubTen {

    override fun test() {

    }
}