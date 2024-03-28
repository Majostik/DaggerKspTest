package com.example.feature2.feature

import javax.inject.Inject

interface Feature2StubOne {

    fun test()
}

class Feature2StubOneImpl @Inject constructor(): Feature2StubOne {

    override fun test() {

    }
}