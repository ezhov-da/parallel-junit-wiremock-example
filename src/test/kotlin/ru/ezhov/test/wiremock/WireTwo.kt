package ru.ezhov.test.wiremock

import com.github.tomakehurst.wiremock.client.WireMock
import org.junit.jupiter.api.Test

class WireTwo {
    @Test
    fun testWireTwo() {
        println("testWireOne: ${Thread.currentThread().name}")

        WireMock.configureFor("localhost", 8089)

        WireMock.stubFor(WireMock.get(WireMock.urlEqualTo("/some/thing"))
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", "text/plain")
                        .withBody("Hello world!")))
    }

    @Test
    fun testWireTwoShouldBeBreak() {
        println("testWireOne: ${Thread.currentThread().name}")

        WireMock.stubFor(WireMock.get(WireMock.urlEqualTo("/some/thing"))
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", "text/plain")
                        .withBody("Hello world!")))
    }
}