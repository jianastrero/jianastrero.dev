package dev.jianastrero.pages.status

import dev.jianastrero.pages.template.MyTemplate
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.ApplicationCall
import io.ktor.server.html.respondHtmlTemplate
import kotlinx.html.h1

suspend fun ApplicationCall.notFound() {
    respondHtmlTemplate(
        MyTemplate("404 - Jian Astrero's Portfolio"),
        status = HttpStatusCode.NotFound,
        MyTemplate::notFound
    )
}

private fun MyTemplate.notFound() {
    body {
        h1 {
            +"404 - Page Not Found"
        }
    }
}
