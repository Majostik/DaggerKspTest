package com.example.feature22.feature

import javax.inject.Inject

interface Feature22StubThree {

    fun test()
}

class Feature22StubThreeImpl @Inject constructor(): Feature22StubThree {

    override fun test() {

    }
}