package com.example.feature25.feature

import javax.inject.Inject

interface Feature25StubTen {

    fun test()
}

class Feature25StubTenImpl @Inject constructor(): Feature25StubTen {

    override fun test() {

    }
}