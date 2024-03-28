package com.example.feature49.feature

import javax.inject.Inject

interface Feature49StubOne {

    fun test()
}

class Feature49StubOneImpl @Inject constructor(): Feature49StubOne {

    override fun test() {

    }
}