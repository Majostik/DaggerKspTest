package com.example.feature12.feature

import javax.inject.Inject

interface Feature12StubFive {

    fun test()
}

class Feature12StubFiveImpl @Inject constructor(): Feature12StubFive {

    override fun test() {

    }
}