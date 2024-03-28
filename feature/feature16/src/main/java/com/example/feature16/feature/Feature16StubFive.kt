package com.example.feature16.feature

import javax.inject.Inject

interface Feature16StubFive {

    fun test()
}

class Feature16StubFiveImpl @Inject constructor(): Feature16StubFive {

    override fun test() {

    }
}