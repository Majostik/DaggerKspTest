package com.example.feature4.feature

import javax.inject.Inject

interface Feature4StubTwo {

    fun test()
}

class Feature4StubTwoImpl @Inject constructor(): Feature4StubTwo {

    override fun test() {

    }
}