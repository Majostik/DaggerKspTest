package com.example.feature25.feature

import javax.inject.Inject

interface Feature25StubFive {

    fun test()
}

class Feature25StubFiveImpl @Inject constructor(): Feature25StubFive {

    override fun test() {

    }
}