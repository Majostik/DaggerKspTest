package com.example.feature18.feature

import javax.inject.Inject

interface Feature18StubThree {

    fun test()
}

class Feature18StubThreeImpl @Inject constructor(): Feature18StubThree {

    override fun test() {

    }
}