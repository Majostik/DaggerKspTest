package com.example.feature7.feature

import javax.inject.Inject

interface Feature7StubFive {

    fun test()
}

class Feature7StubFiveImpl @Inject constructor(): Feature7StubFive {

    override fun test() {

    }
}