package com.example.feature33.feature

import javax.inject.Inject

interface Feature33StubTwo {

    fun test()
}

class Feature33StubTwoImpl @Inject constructor(): Feature33StubTwo {

    override fun test() {

    }
}