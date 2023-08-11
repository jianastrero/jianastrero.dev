package dev.jianastrero.css

import dev.jianastrero.plugins.respondCss
import io.ktor.server.application.call
import io.ktor.server.routing.Routing
import io.ktor.server.routing.get
import kotlinx.css.Border
import kotlinx.css.BorderStyle
import kotlinx.css.Color
import kotlinx.css.CssBuilder
import kotlinx.css.alignItems
import kotlinx.css.backgroundColor
import kotlinx.css.border
import kotlinx.css.display
import kotlinx.css.flexDirection
import kotlinx.css.fontSize
import kotlinx.css.fontWeight
import kotlinx.css.justifyContent
import kotlinx.css.minHeight
import kotlinx.css.px
import kotlinx.css.rem
import kotlinx.css.vh

fun Routing.appCss() {
    get("/app.css") {
        call.respondCss(CssBuilder::appCss)
    }
}

private fun CssBuilder.appCss() {
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
    rule(".text-stroke") {
        backgroundColor = Color.transparent
        border = Border(1.px, BorderStyle.solid, Color.black)
//        setCustomProperty("text-stroke", CssValue("1px solid black"))
    }
}
