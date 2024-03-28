package com.example.feature28.feature

import javax.inject.Inject

interface Feature28StubOne {

    fun test()
}

class Feature28StubOneImpl @Inject constructor(): Feature28StubOne {

    override fun test() {

    }
}