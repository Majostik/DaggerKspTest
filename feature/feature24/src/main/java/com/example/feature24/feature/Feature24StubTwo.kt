package com.example.feature24.feature

import javax.inject.Inject

interface Feature24StubTwo {

    fun test()
}

class Feature24StubTwoImpl @Inject constructor(): Feature24StubTwo {

    override fun test() {

    }
}