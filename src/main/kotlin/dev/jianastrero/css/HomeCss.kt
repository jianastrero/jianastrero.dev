package dev.jianastrero.css

import dev.jianastrero.plugins.respondCss
import io.ktor.server.application.call
import io.ktor.server.routing.Routing
import io.ktor.server.routing.get
import kotlinx.css.CssBuilder


fun Routing.homeCss() {
    get("/app.css") {
        call.respondCss(CssBuilder::homeCss)
    }
}

private fun CssBuilder.homeCss() {
}
