package dev.jianastrero.css

import dev.jianastrero.plugins.respondCss
import io.ktor.server.application.call
import io.ktor.server.routing.Routing
import io.ktor.server.routing.get
import kotlinx.css.CSSBuilder

fun Routing.appCss() {
    get("/app.css") {
        call.respondCss(CSSBuilder::appCss)
    }
}

private fun CSSBuilder.appCss() {

}
