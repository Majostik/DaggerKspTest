package com.example.feature26.feature

import javax.inject.Inject

interface Feature26StubTwo {

    fun test()
}

class Feature26StubTwoImpl @Inject constructor(): Feature26StubTwo {

    override fun test() {

    }
}