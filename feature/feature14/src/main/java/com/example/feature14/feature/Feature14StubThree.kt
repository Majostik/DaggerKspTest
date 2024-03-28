package com.example.feature14.feature

import javax.inject.Inject

interface Feature14StubThree {

    fun test()
}

class Feature14StubThreeImpl @Inject constructor(): Feature14StubThree {

    override fun test() {

    }
}