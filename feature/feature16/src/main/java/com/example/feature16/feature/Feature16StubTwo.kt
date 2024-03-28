package com.example.feature16.feature

import javax.inject.Inject

interface Feature16StubTwo {

    fun test()
}

class Feature16StubTwoImpl @Inject constructor(): Feature16StubTwo {

    override fun test() {

    }
}