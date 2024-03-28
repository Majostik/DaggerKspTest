package com.example.feature23.feature

import javax.inject.Inject

interface Feature23StubFive {

    fun test()
}

class Feature23StubFiveImpl @Inject constructor(): Feature23StubFive {

    override fun test() {

    }
}