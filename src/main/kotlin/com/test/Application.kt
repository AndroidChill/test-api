package com.test

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.test.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080) {
        configureRouting()
    }.start(wait = true)
}
