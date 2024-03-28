package com.example.feature2.feature

import javax.inject.Inject

interface Feature2StubThree {

    fun test()
}

class Feature2StubThreeImpl @Inject constructor(): Feature2StubThree {

    override fun test() {

    }
}