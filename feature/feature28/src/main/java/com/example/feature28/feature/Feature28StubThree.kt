package com.example.feature28.feature

import javax.inject.Inject

interface Feature28StubThree {

    fun test()
}

class Feature28StubThreeImpl @Inject constructor(): Feature28StubThree {

    override fun test() {

    }
}