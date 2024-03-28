package com.example.feature50.feature

import javax.inject.Inject

interface Feature50StubTwo {

    fun test()
}

class Feature50StubTwoImpl @Inject constructor(): Feature50StubTwo {

    override fun test() {

    }
}