package com.example.feature5.feature

import javax.inject.Inject

interface Feature5StubFive {

    fun test()
}

class Feature5StubFiveImpl @Inject constructor(): Feature5StubFive {

    override fun test() {

    }
}