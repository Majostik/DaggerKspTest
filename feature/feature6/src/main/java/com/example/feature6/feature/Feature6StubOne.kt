package com.example.feature6.feature

import javax.inject.Inject

interface Feature6StubOne {

    fun test()
}

class Feature6StubOneImpl @Inject constructor(): Feature6StubOne {

    override fun test() {

    }
}