package com.example.feature20.feature

import javax.inject.Inject

interface Feature20StubThree {

    fun test()
}

class Feature20StubThreeImpl @Inject constructor(): Feature20StubThree {

    override fun test() {

    }
}