package com.example.feature8.feature

import javax.inject.Inject

interface Feature8StubTwo {

    fun test()
}

class Feature8StubTwoImpl @Inject constructor(): Feature8StubTwo {

    override fun test() {

    }
}