package com.test

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.test.plugins.*

fun main() {
    embeddedServer(Netty, port = System.getenv("PORT").toInt()) {
        configureRouting()
    }.start(wait = true)
}
