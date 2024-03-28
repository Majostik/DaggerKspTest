package com.example.feature6.feature

import javax.inject.Inject

interface Feature6StubFive {

    fun test()
}

class Feature6StubFiveImpl @Inject constructor(): Feature6StubFive {

    override fun test() {

    }
}