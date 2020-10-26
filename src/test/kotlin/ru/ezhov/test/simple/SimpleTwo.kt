package ru.ezhov.test.simple

import org.junit.jupiter.api.Test

class SimpleTwo {
    @Test
    fun testTwo() {
        println("testTwo: ${Thread.currentThread().name}")
    }
}