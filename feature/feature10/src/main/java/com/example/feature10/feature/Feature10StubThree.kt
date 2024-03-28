package com.example.feature10.feature

import javax.inject.Inject

interface Feature10StubThree {

    fun test()
}

class Feature10StubThreeImpl @Inject constructor(): Feature10StubThree {

    override fun test() {

    }
}