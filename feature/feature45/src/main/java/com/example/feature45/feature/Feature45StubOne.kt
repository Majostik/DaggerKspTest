package com.example.feature45.feature

import javax.inject.Inject

interface Feature45StubOne {

    fun test()
}

class Feature45StubOneImpl @Inject constructor(): Feature45StubOne {

    override fun test() {

    }
}