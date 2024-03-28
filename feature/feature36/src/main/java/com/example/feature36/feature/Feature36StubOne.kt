package com.example.feature36.feature

import javax.inject.Inject

interface Feature36StubOne {

    fun test()
}

class Feature36StubOneImpl @Inject constructor(): Feature36StubOne {

    override fun test() {

    }
}