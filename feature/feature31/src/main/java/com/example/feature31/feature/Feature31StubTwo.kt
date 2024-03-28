package com.example.feature31.feature

import javax.inject.Inject

interface Feature31StubTwo {

    fun test()
}

class Feature31StubTwoImpl @Inject constructor(): Feature31StubTwo {

    override fun test() {

    }
}