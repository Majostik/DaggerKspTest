package com.example.feature8.feature

import javax.inject.Inject

interface Feature8StubOne {

    fun test()
}

class Feature8StubOneImpl @Inject constructor(): Feature8StubOne {

    override fun test() {

    }
}