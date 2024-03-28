package com.example.feature32.feature

import javax.inject.Inject

interface Feature32StubTwo {

    fun test()
}

class Feature32StubTwoImpl @Inject constructor(): Feature32StubTwo {

    override fun test() {

    }
}