package com.example.feature25.feature

import javax.inject.Inject

interface Feature25StubThree {

    fun test()
}

class Feature25StubThreeImpl @Inject constructor(): Feature25StubThree {

    override fun test() {

    }
}