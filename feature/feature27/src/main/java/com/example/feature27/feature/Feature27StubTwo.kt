package com.example.feature27.feature

import javax.inject.Inject

interface Feature27StubTwo {

    fun test()
}

class Feature27StubTwoImpl @Inject constructor(): Feature27StubTwo {

    override fun test() {

    }
}