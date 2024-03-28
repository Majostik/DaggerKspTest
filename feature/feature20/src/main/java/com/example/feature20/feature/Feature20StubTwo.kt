package com.example.feature20.feature

import javax.inject.Inject

interface Feature20StubTwo {

    fun test()
}

class Feature20StubTwoImpl @Inject constructor(): Feature20StubTwo {

    override fun test() {

    }
}