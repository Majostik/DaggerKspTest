package com.example.feature23.feature

import javax.inject.Inject

interface Feature23StubOne {

    fun test()
}

class Feature23StubOneImpl @Inject constructor(): Feature23StubOne {

    override fun test() {

    }
}