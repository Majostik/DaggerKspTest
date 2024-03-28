package com.example.feature10.feature

import javax.inject.Inject

interface Feature10StubTwo {

    fun test()
}

class Feature10StubTwoImpl @Inject constructor(): Feature10StubTwo {

    override fun test() {

    }
}