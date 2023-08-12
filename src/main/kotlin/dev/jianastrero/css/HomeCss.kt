package dev.jianastrero.css

import dev.jianastrero.plugins.respondCss
import io.ktor.server.application.call
import io.ktor.server.routing.Routing
import io.ktor.server.routing.get
import kotlinx.css.CssBuilder
import kotlinx.css.rem
import kotlinx.css.width


fun Routing.homeCss() {
    get("/home.css") {
        call.respondCss(CssBuilder::homeCss)
    }
}

private fun CssBuilder.homeCss() {
    rule(".jian-image") {
        width = 18.rem
    }
}
