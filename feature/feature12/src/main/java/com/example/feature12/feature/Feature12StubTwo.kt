package com.example.feature12.feature

import javax.inject.Inject

interface Feature12StubTwo {

    fun test()
}

class Feature12StubTwoImpl @Inject constructor(): Feature12StubTwo {

    override fun test() {

    }
}