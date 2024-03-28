package com.example.feature40.feature

import javax.inject.Inject

interface Feature40StubTwo {

    fun test()
}

class Feature40StubTwoImpl @Inject constructor(): Feature40StubTwo {

    override fun test() {

    }
}