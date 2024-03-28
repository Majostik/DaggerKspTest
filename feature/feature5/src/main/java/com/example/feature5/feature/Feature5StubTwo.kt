package com.example.feature5.feature

import javax.inject.Inject

interface Feature5StubTwo {

    fun test()
}

class Feature5StubTwoImpl @Inject constructor(): Feature5StubTwo {

    override fun test() {

    }
}