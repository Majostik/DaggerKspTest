package com.example.feature7.feature

import javax.inject.Inject

interface Feature7StubFour {

    fun test()
}

class Feature7StubFourImpl @Inject constructor(): Feature7StubFour {

    override fun test() {

    }
}