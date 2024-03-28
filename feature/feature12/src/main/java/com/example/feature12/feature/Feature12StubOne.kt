package com.example.feature12.feature

import javax.inject.Inject

interface Feature12StubOne {

    fun test()
}

class Feature12StubOneImpl @Inject constructor(): Feature12StubOne {

    override fun test() {

    }
}