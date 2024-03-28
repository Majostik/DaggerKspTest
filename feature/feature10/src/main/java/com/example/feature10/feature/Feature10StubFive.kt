package com.example.feature10.feature

import javax.inject.Inject

interface Feature10StubFive {

    fun test()
}

class Feature10StubFiveImpl @Inject constructor(): Feature10StubFive {

    override fun test() {

    }
}