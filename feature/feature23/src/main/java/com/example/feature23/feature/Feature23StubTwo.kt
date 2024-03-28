package com.example.feature23.feature

import javax.inject.Inject

interface Feature23StubTwo {

    fun test()
}

class Feature23StubTwoImpl @Inject constructor(): Feature23StubTwo {

    override fun test() {

    }
}