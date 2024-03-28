package com.example.feature32.feature

import javax.inject.Inject

interface Feature32StubThree {

    fun test()
}

class Feature32StubThreeImpl @Inject constructor(): Feature32StubThree {

    override fun test() {

    }
}