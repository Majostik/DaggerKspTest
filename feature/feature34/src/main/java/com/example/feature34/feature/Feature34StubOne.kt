package com.example.feature34.feature

import javax.inject.Inject

interface Feature34StubOne {

    fun test()
}

class Feature34StubOneImpl @Inject constructor(): Feature34StubOne {

    override fun test() {

    }
}