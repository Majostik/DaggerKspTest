package com.example.feature41.feature

import javax.inject.Inject

interface Feature41StubTwo {

    fun test()
}

class Feature41StubTwoImpl @Inject constructor(): Feature41StubTwo {

    override fun test() {

    }
}