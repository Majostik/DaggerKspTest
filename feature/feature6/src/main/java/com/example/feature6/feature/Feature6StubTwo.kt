package com.example.feature6.feature

import javax.inject.Inject

interface Feature6StubTwo {

    fun test()
}

class Feature6StubTwoImpl @Inject constructor(): Feature6StubTwo {

    override fun test() {

    }
}