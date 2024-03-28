package com.example.feature5.feature

import javax.inject.Inject

interface Feature5StubTen {

    fun test()
}

class Feature5StubTenImpl @Inject constructor(): Feature5StubTen {

    override fun test() {

    }
}