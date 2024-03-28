package com.example.feature22.feature

import javax.inject.Inject

interface Feature22StubTwo {

    fun test()
}

class Feature22StubTwoImpl @Inject constructor(): Feature22StubTwo {

    override fun test() {

    }
}