package com.example.feature18.feature

import javax.inject.Inject

interface Feature18StubTwo {

    fun test()
}

class Feature18StubTwoImpl @Inject constructor(): Feature18StubTwo {

    override fun test() {

    }
}