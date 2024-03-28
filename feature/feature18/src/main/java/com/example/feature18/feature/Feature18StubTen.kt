package com.example.feature18.feature

import javax.inject.Inject

interface Feature18StubTen {

    fun test()
}

class Feature18StubTenImpl @Inject constructor(): Feature18StubTen {

    override fun test() {

    }
}