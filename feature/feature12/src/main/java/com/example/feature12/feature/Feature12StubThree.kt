package com.example.feature12.feature

import javax.inject.Inject

interface Feature12StubThree {

    fun test()
}

class Feature12StubThreeImpl @Inject constructor(): Feature12StubThree {

    override fun test() {

    }
}