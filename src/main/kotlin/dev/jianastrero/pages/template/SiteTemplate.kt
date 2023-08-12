package dev.jianastrero.pages.template

import dev.jianastrero.components.appDrawer
import dev.jianastrero.components.appHeader
import dev.jianastrero.js.appJs
import dev.jianastrero.template.BaseTemplate
import dev.jianastrero.theme.defineFont
import kotlinx.html.BODY
import kotlinx.html.HEAD
import kotlinx.html.ScriptType
import kotlinx.html.link
import kotlinx.html.script

class SiteTemplate(title: String) : BaseTemplate(title) {
    override fun HEAD.beforeHead() {
        link(rel = "stylesheet", href = "app.css")
        defineFont()
        script(
            type = ScriptType.textJavaScript,
            src = "https://cdnjs.cloudflare.com/ajax/libs/bodymovin/5.7.4/lottie.min.js"
        ) {}
        script(
            type = ScriptType.textJavaScript,
            src = "https://unpkg.com/@lottiefiles/lottie-player@latest/dist/lottie-player.js"
        ) {}
        script(
            type = ScriptType.textJavaScript,
            src = "https://unpkg.com/@lottiefiles/lottie-interactivity@latest/dist/lottie-interactivity.min.js"
        ) {}
    }

    override fun HEAD.afterHead() {}

    override fun BODY.beforeBody() {
        appHeader()
        appDrawer()
    }

    override fun BODY.afterBody() {
        appJs()
    }
}
