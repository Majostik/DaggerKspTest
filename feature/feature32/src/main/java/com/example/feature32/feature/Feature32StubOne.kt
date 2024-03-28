package com.example.feature32.feature

import javax.inject.Inject

interface Feature32StubOne {

    fun test()
}

class Feature32StubOneImpl @Inject constructor(): Feature32StubOne {

    override fun test() {

    }
}