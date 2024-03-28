package com.example.feature32.feature

import javax.inject.Inject

interface Feature32StubTen {

    fun test()
}

class Feature32StubTenImpl @Inject constructor(): Feature32StubTen {

    override fun test() {

    }
}