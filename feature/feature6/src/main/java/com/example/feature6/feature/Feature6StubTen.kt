package com.example.feature6.feature

import javax.inject.Inject

interface Feature6StubTen {

    fun test()
}

class Feature6StubTenImpl @Inject constructor(): Feature6StubTen {

    override fun test() {

    }
}