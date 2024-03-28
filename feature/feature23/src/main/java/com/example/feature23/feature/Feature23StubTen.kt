package com.example.feature23.feature

import javax.inject.Inject

interface Feature23StubTen {

    fun test()
}

class Feature23StubTenImpl @Inject constructor(): Feature23StubTen {

    override fun test() {

    }
}