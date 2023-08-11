package dev.jianastrero.plugins

import io.ktor.http.ContentType
import io.ktor.server.application.Application
import io.ktor.server.application.ApplicationCall
import io.ktor.server.application.call
import io.ktor.server.application.install
import io.ktor.server.html.respondHtml
import io.ktor.server.response.respond
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.routing
import io.ktor.server.thymeleaf.Thymeleaf
import io.ktor.server.thymeleaf.ThymeleafContent
import kotlinx.css.Color
import kotlinx.css.CssBuilder
import kotlinx.css.Margin
import kotlinx.css.backgroundColor
import kotlinx.css.body
import kotlinx.css.color
import kotlinx.css.margin
import kotlinx.css.px
import kotlinx.html.body
import kotlinx.html.h1
import kotlinx.html.head
import kotlinx.html.li
import kotlinx.html.link
import kotlinx.html.ul
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver

fun Application.configureTemplating() {
    install(Thymeleaf) {
        setTemplateResolver(ClassLoaderTemplateResolver().apply {
            prefix = "templates/thymeleaf/"
            suffix = ".html"
            characterEncoding = "utf-8"
        })
    }
    routing {
        get("/html-dsl") {
            call.respondHtml {
                body {
                    h1 { +"HTML" }
                    ul {
                        for (n in 1..10) {
                            li { +"$n" }
                        }
                    }
                }
            }
        }
        get("/styles.css") {
            call.respondCss {
                body {
                    backgroundColor = Color.darkBlue
                    margin = Margin(0.px)
                }
                rule("h1.page-title") {
                    color = Color.white
                }
            }
        }

        get("/html-css-dsl") {
            call.respondHtml {
                head {
                    link(rel = "stylesheet", href = "/styles.css", type = "text/css")
                }
                body {
                    h1(classes = "page-title") {
                        +"Hello from Ktor!"
                    }
                }
            }
        }
        get("/html-thymeleaf") {
            call.respond(ThymeleafContent("index", mapOf("user" to ThymeleafUser(1, "user1"))))
        }
    }
}

suspend inline fun ApplicationCall.respondCss(builder: CssBuilder.() -> Unit) {
    this.respondText(CssBuilder().apply(builder).toString(), ContentType.Text.CSS)
}


data class ThymeleafUser(val id: Int, val name: String)
