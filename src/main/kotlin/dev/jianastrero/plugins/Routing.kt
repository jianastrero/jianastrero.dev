package dev.jianastrero.plugins

import dev.jianastrero.css.appCss
import dev.jianastrero.css.fontCss
import dev.jianastrero.pages.status.notFound
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.Application
import io.ktor.server.application.call
import io.ktor.server.application.install
import io.ktor.server.http.content.staticFiles
import io.ktor.server.plugins.autohead.AutoHeadResponse
import io.ktor.server.plugins.statuspages.StatusPages
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.routing
import java.io.File

fun Application.configureRouting() {
    install(AutoHeadResponse)
    install(StatusPages) {
        status(HttpStatusCode.NotFound) { call, _ ->
            call.notFound()
        }
        exception<Throwable> { call, cause ->
            call.respondText(text = "500: $cause", status = HttpStatusCode.InternalServerError)
        }
    }
    routing {
        get("/") {
            call.respondText("Hello Jian!")
        }
        fontCss()
        appCss()
        staticFiles("icon", File("src/main/resources/static/icon"))
    }
}
