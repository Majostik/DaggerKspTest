package com.example.feature5.feature

import javax.inject.Inject

interface Feature5StubThree {

    fun test()
}

class Feature5StubThreeImpl @Inject constructor(): Feature5StubThree {

    override fun test() {

    }
}