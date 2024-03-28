package com.example.feature36.feature

import javax.inject.Inject

interface Feature36StubTwo {

    fun test()
}

class Feature36StubTwoImpl @Inject constructor(): Feature36StubTwo {

    override fun test() {

    }
}