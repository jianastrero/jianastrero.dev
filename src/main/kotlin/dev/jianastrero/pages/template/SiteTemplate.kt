package dev.jianastrero.pages.template

import dev.jianastrero.templating.BaseTemplate
import dev.jianastrero.theme.defineFont
import kotlinx.html.BODY
import kotlinx.html.HEAD
import kotlinx.html.link

class SiteTemplate(title: String) : BaseTemplate(title) {
    override fun HEAD.beforeHead() {
        link(rel = "stylesheet", href = "app.css")
        defineFont()
    }

    override fun HEAD.afterHead() {}

    override fun BODY.beforeBody() {}

    override fun BODY.afterBody() {}
}
