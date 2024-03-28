package com.example.feature7.feature

import javax.inject.Inject

interface Feature7StubThree {

    fun test()
}

class Feature7StubThreeImpl @Inject constructor(): Feature7StubThree {

    override fun test() {

    }
}