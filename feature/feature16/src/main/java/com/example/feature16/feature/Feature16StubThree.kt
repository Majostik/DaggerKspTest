package com.example.feature16.feature

import javax.inject.Inject

interface Feature16StubThree {

    fun test()
}

class Feature16StubThreeImpl @Inject constructor(): Feature16StubThree {

    override fun test() {

    }
}