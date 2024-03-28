package com.example.feature6.feature

import javax.inject.Inject

interface Feature6StubThree {

    fun test()
}

class Feature6StubThreeImpl @Inject constructor(): Feature6StubThree {

    override fun test() {

    }
}