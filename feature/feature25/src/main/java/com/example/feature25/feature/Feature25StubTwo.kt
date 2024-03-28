package com.example.feature25.feature

import javax.inject.Inject

interface Feature25StubTwo {

    fun test()
}

class Feature25StubTwoImpl @Inject constructor(): Feature25StubTwo {

    override fun test() {

    }
}