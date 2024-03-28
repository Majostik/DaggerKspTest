package com.example.feature12.feature

import javax.inject.Inject

interface Feature12StubTen {

    fun test()
}

class Feature12StubTenImpl @Inject constructor(): Feature12StubTen {

    override fun test() {

    }
}