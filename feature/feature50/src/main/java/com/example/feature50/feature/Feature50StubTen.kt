package com.example.feature50.feature

import javax.inject.Inject

interface Feature50StubTen {

    fun test()
}

class Feature50StubTenImpl @Inject constructor(): Feature50StubTen {

    override fun test() {

    }
}