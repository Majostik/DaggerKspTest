package com.example.feature19.feature

import javax.inject.Inject

interface Feature19StubOne {

    fun test()
}

class Feature19StubOneImpl @Inject constructor(): Feature19StubOne {

    override fun test() {

    }
}