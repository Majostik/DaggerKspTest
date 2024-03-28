package com.example.feature16.feature

import javax.inject.Inject

interface Feature16StubTen {

    fun test()
}

class Feature16StubTenImpl @Inject constructor(): Feature16StubTen {

    override fun test() {

    }
}