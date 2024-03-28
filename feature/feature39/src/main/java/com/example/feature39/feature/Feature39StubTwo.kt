package com.example.feature39.feature

import javax.inject.Inject

interface Feature39StubTwo {

    fun test()
}

class Feature39StubTwoImpl @Inject constructor(): Feature39StubTwo {

    override fun test() {

    }
}