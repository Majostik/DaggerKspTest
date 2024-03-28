package com.example.feature32.feature

import javax.inject.Inject

interface Feature32StubFive {

    fun test()
}

class Feature32StubFiveImpl @Inject constructor(): Feature32StubFive {

    override fun test() {

    }
}