package com.example.feature33.feature

import javax.inject.Inject

interface Feature33StubOne {

    fun test()
}

class Feature33StubOneImpl @Inject constructor(): Feature33StubOne {

    override fun test() {

    }
}