package com.example.feature44.feature

import javax.inject.Inject

interface Feature44StubOne {

    fun test()
}

class Feature44StubOneImpl @Inject constructor(): Feature44StubOne {

    override fun test() {

    }
}