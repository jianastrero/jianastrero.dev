package dev.jianastrero.pages.template

import dev.jianastrero.theme.defineFont
import io.ktor.server.html.Placeholder
import io.ktor.server.html.Template
import io.ktor.server.html.insert
import kotlinx.html.BODY
import kotlinx.html.HEAD
import kotlinx.html.HTML
import kotlinx.html.body
import kotlinx.html.head
import kotlinx.html.lang
import kotlinx.html.link
import kotlinx.html.meta
import kotlinx.html.title

class MyTemplate(val title: String) : Template<HTML> {
    val head = Placeholder<HEAD>()
    val body = Placeholder<BODY>()
    override fun HTML.apply() {
        lang = "en"

        head {
            meta(charset = "utf-8")
            title { +this@MyTemplate.title }
            meta(name = "viewport", content = "width=device-width, initial-scale=1.0")
            meta(name = "description", content = "Jian Astrero's Portfolio")
            meta(name = "author", content = "Jian Astrero")
            meta(name = "keywords", content = "Jian Astrero, Jian, Astrero, Portfolio, Jian Astrero's Portfolio")
            defineFont()
            link(rel = "stylesheet", href = "app.css")
            insert(this@MyTemplate.head)
        }

        body {
            insert(this@MyTemplate.body)
        }
    }
}
