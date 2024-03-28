package com.example.feature33.feature

import javax.inject.Inject

interface Feature33StubThree {

    fun test()
}

class Feature33StubThreeImpl @Inject constructor(): Feature33StubThree {

    override fun test() {

    }
}