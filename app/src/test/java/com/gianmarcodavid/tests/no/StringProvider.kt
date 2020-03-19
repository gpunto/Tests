package com.gianmarcodavid.tests.no

import io.mockk.every
import io.mockk.mockk
import kotlin.random.Random

interface StringProvider {
    fun getString(): String
}

fun mockStringProvider(): StringProvider = mockk {
    every { getString() } answers { Random(System.currentTimeMillis()).nextInt().toString() }
}