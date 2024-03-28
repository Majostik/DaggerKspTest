package com.example.feature23.feature

import javax.inject.Inject

interface Feature23StubFour {

    fun test()
}

class Feature23StubFourImpl @Inject constructor(): Feature23StubFour {

    override fun test() {

    }
}