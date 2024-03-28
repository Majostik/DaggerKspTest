package com.example.feature31.feature

import javax.inject.Inject

interface Feature31StubThree {

    fun test()
}

class Feature31StubThreeImpl @Inject constructor(): Feature31StubThree {

    override fun test() {

    }
}