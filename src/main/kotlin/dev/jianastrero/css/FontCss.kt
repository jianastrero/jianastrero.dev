package dev.jianastrero.css

import dev.jianastrero.plugins.respondCss
import io.ktor.server.application.call
import io.ktor.server.routing.Routing
import io.ktor.server.routing.get
import kotlinx.css.CSSBuilder
import kotlinx.css.fontFamily

fun Routing.fontCss() {
    get("/font.css") {
        call.respondCss(CSSBuilder::fontCss)
    }
}

private fun CSSBuilder.fontCss() {
    rule("*") {
        fontFamily = "Montserrat, sans-serif"
    }
}
