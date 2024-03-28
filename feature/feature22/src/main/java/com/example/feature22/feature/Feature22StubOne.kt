package com.example.feature22.feature

import javax.inject.Inject

interface Feature22StubOne {

    fun test()
}

class Feature22StubOneImpl @Inject constructor(): Feature22StubOne {

    override fun test() {

    }
}