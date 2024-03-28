package com.example.feature7.feature

import javax.inject.Inject

interface Feature7StubOne {

    fun test()
}

class Feature7StubOneImpl @Inject constructor(): Feature7StubOne {

    override fun test() {

    }
}