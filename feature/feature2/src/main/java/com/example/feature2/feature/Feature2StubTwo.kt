package com.example.feature_1.feature

import javax.inject.Inject

interface Feature2StubTwo {

    fun test()
}

class Feature2StubTwoImpl @Inject constructor(): Feature2StubTwo {

    override fun test() {

    }
}