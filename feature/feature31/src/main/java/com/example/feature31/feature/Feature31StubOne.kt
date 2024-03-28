package com.example.feature31.feature

import javax.inject.Inject

interface Feature31StubOne {

    fun test()
}

class Feature31StubOneImpl @Inject constructor(): Feature31StubOne {

    override fun test() {

    }
}