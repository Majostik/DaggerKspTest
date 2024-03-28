package com.example.feature23.feature

import javax.inject.Inject

interface Feature23StubThree {

    fun test()
}

class Feature23StubThreeImpl @Inject constructor(): Feature23StubThree {

    override fun test() {

    }
}