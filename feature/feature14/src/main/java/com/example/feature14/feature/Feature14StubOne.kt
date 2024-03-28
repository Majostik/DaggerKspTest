package com.example.feature14.feature

import javax.inject.Inject

interface Feature14StubOne {

    fun test()
}

class Feature14StubOneImpl @Inject constructor(): Feature14StubOne {

    override fun test() {

    }
}