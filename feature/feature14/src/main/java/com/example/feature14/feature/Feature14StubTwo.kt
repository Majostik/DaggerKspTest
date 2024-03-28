package com.example.feature14.feature

import javax.inject.Inject

interface Feature14StubTwo {

    fun test()
}

class Feature14StubTwoImpl @Inject constructor(): Feature14StubTwo {

    override fun test() {

    }
}