package com.example.feature50.feature

import javax.inject.Inject

interface Feature50StubThree {

    fun test()
}

class Feature50StubThreeImpl @Inject constructor(): Feature50StubThree {

    override fun test() {

    }
}