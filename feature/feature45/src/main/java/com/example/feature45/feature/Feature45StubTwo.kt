package com.example.feature45.feature

import javax.inject.Inject

interface Feature45StubTwo {

    fun test()
}

class Feature45StubTwoImpl @Inject constructor(): Feature45StubTwo {

    override fun test() {

    }
}