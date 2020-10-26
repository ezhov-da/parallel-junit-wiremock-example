package ru.ezhov.test.simple

import org.junit.jupiter.api.Test

class SimpleOne {
    @Test
    fun testOne() {
        println("testOne: ${Thread.currentThread().name}")
    }
}