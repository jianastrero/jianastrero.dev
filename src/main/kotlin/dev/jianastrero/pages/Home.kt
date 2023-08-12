package dev.jianastrero.pages

import dev.jianastrero.Constants
import dev.jianastrero.pages.template.SiteTemplate
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.html.respondHtmlTemplate
import io.ktor.server.routing.Routing
import io.ktor.server.routing.get
import kotlinx.html.br
import kotlinx.html.div
import kotlinx.html.img
import kotlinx.html.link
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
    head {
        link(rel = "stylesheet", href = "${Constants.BASE_URL}/home.css")
    }
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
            span(classes = "unselectable flex-one flex align-items-flex-end justify-content-center align-self-stretch") {
                img(
                    src = "${Constants.BASE_URL}/images/jianastrero.png",
                    alt = "Jian James Astrero",
                    classes = "jian-image "
                ) {

                }
            }
        }
    }
}
