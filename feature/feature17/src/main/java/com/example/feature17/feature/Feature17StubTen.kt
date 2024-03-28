package com.example.feature17.feature

import javax.inject.Inject

interface Feature17StubTen {

    fun test()
}

class Feature17StubTenImpl @Inject constructor(): Feature17StubTen {

    override fun test() {

    }
}