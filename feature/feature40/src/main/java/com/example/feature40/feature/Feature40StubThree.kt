package com.example.feature40.feature

import javax.inject.Inject

interface Feature40StubThree {

    fun test()
}

class Feature40StubThreeImpl @Inject constructor(): Feature40StubThree {

    override fun test() {

    }
}