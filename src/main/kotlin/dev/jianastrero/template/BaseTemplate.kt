package dev.jianastrero.template

import io.ktor.server.html.Placeholder
import io.ktor.server.html.Template
import io.ktor.server.html.insert
import kotlinx.html.BODY
import kotlinx.html.HEAD
import kotlinx.html.HTML
import kotlinx.html.body
import kotlinx.html.head
import kotlinx.html.lang
import kotlinx.html.meta
import kotlinx.html.title

abstract class BaseTemplate(
    private val title: String = "",
    private val author: String = "Jian Astrero",
    private val keywords: Array<String> = arrayOf("Jian Astrero", "Jian", "Astrero", "Portfolio", "Jian Astrero's Portfolio"),
) : Template<HTML> {

    val head = Placeholder<HEAD>()
    val body = Placeholder<BODY>()

    override fun HTML.apply() {
        lang = "en"

        head {
            meta(charset = "utf-8")
            title { +this@BaseTemplate.title.let { if (it.isBlank()) DEFAULT_TITLE else "$it - $DEFAULT_TITLE" } }
            meta(name = "viewport", content = "width=device-width, initial-scale=1.0")
            meta(name = "description", content = this@BaseTemplate.title)
            meta(name = "author", content = author)
            meta(name = "keywords", content = keywords.joinToString(", "))
            beforeHead()
            insert(this@BaseTemplate.head)
            afterHead()
        }

        body {
            beforeBody()
            insert(this@BaseTemplate.body)
            afterBody()
        }
    }

    protected abstract fun HEAD.beforeHead()
    protected abstract fun HEAD.afterHead()
    protected abstract fun BODY.beforeBody()
    protected abstract fun BODY.afterBody()

    companion object {
        const val DEFAULT_TITLE = "Jian Astrero's Portfolio"
    }
}
