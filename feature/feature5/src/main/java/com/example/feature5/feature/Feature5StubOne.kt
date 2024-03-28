package com.example.feature5.feature

import javax.inject.Inject

interface Feature5StubOne {

    fun test()
}

class Feature5StubOneImpl @Inject constructor(): Feature5StubOne {

    override fun test() {

    }
}