package com.example.feature19.feature

import javax.inject.Inject

interface Feature19StubThree {

    fun test()
}

class Feature19StubThreeImpl @Inject constructor(): Feature19StubThree {

    override fun test() {

    }
}