package com.example.feature20.feature

import javax.inject.Inject

interface Feature20StubTen {

    fun test()
}

class Feature20StubTenImpl @Inject constructor(): Feature20StubTen {

    override fun test() {

    }
}