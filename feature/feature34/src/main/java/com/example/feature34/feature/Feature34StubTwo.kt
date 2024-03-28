package com.example.feature34.feature

import javax.inject.Inject

interface Feature34StubTwo {

    fun test()
}

class Feature34StubTwoImpl @Inject constructor(): Feature34StubTwo {

    override fun test() {

    }
}