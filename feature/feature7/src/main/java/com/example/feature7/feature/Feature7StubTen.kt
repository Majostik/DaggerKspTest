package com.example.feature7.feature

import javax.inject.Inject

interface Feature7StubTen {

    fun test()
}

class Feature7StubTenImpl @Inject constructor(): Feature7StubTen {

    override fun test() {

    }
}