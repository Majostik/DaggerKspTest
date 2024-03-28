package com.example.feature19.feature

import javax.inject.Inject

interface Feature19StubTwo {

    fun test()
}

class Feature19StubTwoImpl @Inject constructor(): Feature19StubTwo {

    override fun test() {

    }
}