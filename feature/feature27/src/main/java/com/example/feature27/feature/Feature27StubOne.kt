package com.example.feature27.feature

import javax.inject.Inject

interface Feature27StubOne {

    fun test()
}

class Feature27StubOneImpl @Inject constructor(): Feature27StubOne {

    override fun test() {

    }
}