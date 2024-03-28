package com.example.feature16.feature

import javax.inject.Inject

interface Feature16StubOne {

    fun test()
}

class Feature16StubOneImpl @Inject constructor(): Feature16StubOne {

    override fun test() {

    }
}