package com.example.feature26.feature

import javax.inject.Inject

interface Feature26StubThree {

    fun test()
}

class Feature26StubThreeImpl @Inject constructor(): Feature26StubThree {

    override fun test() {

    }
}