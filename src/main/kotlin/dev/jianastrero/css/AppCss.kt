package dev.jianastrero.css

import dev.jianastrero.plugins.respondCss
import io.ktor.server.application.call
import io.ktor.server.routing.Routing
import io.ktor.server.routing.get
import kotlinx.css.Color
import kotlinx.css.CssBuilder
import kotlinx.css.Margin
import kotlinx.css.Padding
import kotlinx.css.alignItems
import kotlinx.css.background
import kotlinx.css.color
import kotlinx.css.display
import kotlinx.css.flexDirection
import kotlinx.css.fontSize
import kotlinx.css.fontWeight
import kotlinx.css.justifyContent
import kotlinx.css.margin
import kotlinx.css.minHeight
import kotlinx.css.padding
import kotlinx.css.px
import kotlinx.css.rem
import kotlinx.css.vh

fun Routing.appCss() {
    get("/app.css") {
        call.respondCss(CssBuilder::appCss)
    }
}

private fun CssBuilder.appCss() {
    rule("body") {
        margin = Margin(0.px)
        padding = Padding(0.px)
        background = "#000000"
    }
    rule(".section") {
        display = kotlinx.css.Display.flex
        flexDirection = kotlinx.css.FlexDirection.column
        alignItems = kotlinx.css.Align.center
        justifyContent = kotlinx.css.JustifyContent.center
        minHeight = 100.vh
    }
    rule(".text-weight-black") {
        fontWeight = kotlinx.css.FontWeight.w900
    }
    rule(".text-xlarge") {
        fontSize = 8.rem
    }
    rule(".default-gradient") {
        background = "conic-gradient(from 220deg at 35.12% 73.82%, #001C30 0deg, rgba(0, 28, 48, 0.00) 344.6943712234497deg)"
    }
    rule("*") {
        color = Color("#D1DAE0")
    }
}
