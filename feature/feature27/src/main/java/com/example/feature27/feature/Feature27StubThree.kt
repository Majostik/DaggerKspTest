package com.example.feature27.feature

import javax.inject.Inject

interface Feature27StubThree {

    fun test()
}

class Feature27StubThreeImpl @Inject constructor(): Feature27StubThree {

    override fun test() {

    }
}