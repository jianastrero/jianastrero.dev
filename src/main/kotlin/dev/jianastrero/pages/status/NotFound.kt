package dev.jianastrero.pages.status

import dev.jianastrero.pages.template.SiteTemplate
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.ApplicationCall
import io.ktor.server.html.respondHtmlTemplate
import kotlinx.html.div
import kotlinx.html.span

suspend fun ApplicationCall.notFound() {
    respondHtmlTemplate(
        SiteTemplate("404"),
        status = HttpStatusCode.NotFound,
        SiteTemplate::notFound
    )
}

private fun SiteTemplate.notFound() {
    body {
        div(classes = "section default-gradient") {
            span(classes = "text-weight-black text-xlarge text-stroke unselectable") {
                +"404"
            }
        }
    }
}
