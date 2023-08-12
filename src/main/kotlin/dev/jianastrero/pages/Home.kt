package dev.jianastrero.pages

import dev.jianastrero.pages.template.SiteTemplate
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.html.respondHtmlTemplate
import io.ktor.server.routing.Routing
import io.ktor.server.routing.get
import kotlinx.html.br
import kotlinx.html.div
import kotlinx.html.span


fun Routing.homePage() {
    get("/") {
        call.respondHtmlTemplate(
            SiteTemplate(""),
            status = HttpStatusCode.OK,
            SiteTemplate::homePage
        )
    }
}

private fun SiteTemplate.homePage() {
    body {
        div(classes = "section default-gradient flex flex-row flex-center") {
            span(classes = "unselectable flex-one flex flex-column flex-end") {
                span(classes = "flex flex-column") {
                    span(classes = "text-pacifico text-xxsmall text-half-dark") {
                        +"Hello, I'm"
                    }
                    span(classes = "text-xlarge text-weight-black") {
                        +"Jian"
                        br()
                        +"James"
                        br()
                        +"Astrero"
                    }
                }
            }
            div(classes = "unselectable flex-one") {

            }
        }
    }
}
