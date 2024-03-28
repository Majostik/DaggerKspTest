package com.example.feature7.feature

import javax.inject.Inject

interface Feature7StubTwo {

    fun test()
}

class Feature7StubTwoImpl @Inject constructor(): Feature7StubTwo {

    override fun test() {

    }
}