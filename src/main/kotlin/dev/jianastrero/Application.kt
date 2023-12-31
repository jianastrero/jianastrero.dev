package dev.jianastrero

import dev.jianastrero.plugins.*
import io.ktor.server.application.*
import io.ktor.server.netty.EngineMain

fun main(args: Array<String>) {
    EngineMain.main(args)
}

fun Application.module() {
    configureSecurity()
    configureHTTP()
    configureTemplating()
    configureRouting()
}
