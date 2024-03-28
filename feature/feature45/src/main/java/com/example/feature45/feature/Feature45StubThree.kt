package com.example.feature45.feature

import javax.inject.Inject

interface Feature45StubThree {

    fun test()
}

class Feature45StubThreeImpl @Inject constructor(): Feature45StubThree {

    override fun test() {

    }
}