package com.gianmarcodavid.tests.no

import org.junit.Test

class Test545 {
    private val provider = mockStringProvider()

    @Test
    fun abc() {
        println(provider.getString())
    }

    @Test
    fun def() {
        println(provider.getString())
    }

    @Test
    fun ghi() {
        println(provider.getString())
    }
}
