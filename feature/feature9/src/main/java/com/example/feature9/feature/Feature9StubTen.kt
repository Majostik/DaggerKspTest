package com.example.feature9.feature

import javax.inject.Inject

interface Feature9StubTen {

    fun test()
}

class Feature9StubTenImpl @Inject constructor(): Feature9StubTen {

    override fun test() {

    }
}