package com.example.feature28.feature

import javax.inject.Inject

interface Feature28StubTwo {

    fun test()
}

class Feature28StubTwoImpl @Inject constructor(): Feature28StubTwo {

    override fun test() {

    }
}