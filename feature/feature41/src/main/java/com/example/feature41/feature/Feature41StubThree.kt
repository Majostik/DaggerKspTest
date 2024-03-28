package com.example.feature41.feature

import javax.inject.Inject

interface Feature41StubThree {

    fun test()
}

class Feature41StubThreeImpl @Inject constructor(): Feature41StubThree {

    override fun test() {

    }
}