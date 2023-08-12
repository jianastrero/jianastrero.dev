package dev.jianastrero.css

import dev.jianastrero.plugins.respondCss
import io.ktor.server.application.call
import io.ktor.server.routing.Routing
import io.ktor.server.routing.get
import kotlinx.css.CssBuilder
import kotlinx.css.fontFamily

fun Routing.fontCss() {
    get("/font.css") {
        call.respondCss(CssBuilder::fontCss)
    }
}

private fun CssBuilder.fontCss() {
    rule("*") {
        fontFamily = "'Montserrat', sans-serif"
    }
    rule(".text-pacifico") {
        fontFamily = "'Pacifico', cursive"
    }
}
