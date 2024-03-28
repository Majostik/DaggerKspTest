package com.example.feature26.feature

import javax.inject.Inject

interface Feature26StubOne {

    fun test()
}

class Feature26StubOneImpl @Inject constructor(): Feature26StubOne {

    override fun test() {

    }
}