package com.example.feature5.feature

import javax.inject.Inject

interface Feature5StubSeven {

    fun test()
}

class Feature5StubSevenImpl @Inject constructor(): Feature5StubSeven {

    override fun test() {

    }
}