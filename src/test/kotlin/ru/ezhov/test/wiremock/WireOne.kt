package ru.ezhov.test.wiremock

import com.github.tomakehurst.wiremock.client.WireMock
import org.junit.jupiter.api.Test

class WireOne {

    @Test
    fun testWireOne() {
        println("testWireOne: ${Thread.currentThread().name}")

        WireMock.configureFor("localhost", 8089)

        WireMock.stubFor(WireMock.get(WireMock.urlEqualTo("/some/thing"))
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", "text/plain")
                        .withBody("Hello world!")))
    }

    @Test
    fun testWireOneShouldBeBreak() {
        println("testWireOne: ${Thread.currentThread().name}")

        WireMock.stubFor(WireMock.get(WireMock.urlEqualTo("/some/thing"))
                .willReturn(WireMock.aResponse()
                        .withHeader("Content-Type", "text/plain")
                        .withBody("Hello world!")))
    }
}