package com.example.feature8.feature

import javax.inject.Inject

interface Feature8StubThree {

    fun test()
}

class Feature8StubThreeImpl @Inject constructor(): Feature8StubThree {

    override fun test() {

    }
}