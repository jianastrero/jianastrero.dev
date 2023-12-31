package dev.jianastrero.css

import dev.jianastrero.plugins.respondCss
import io.ktor.server.application.call
import io.ktor.server.routing.Routing
import io.ktor.server.routing.get
import kotlinx.css.Color
import kotlinx.css.CssBuilder
import kotlinx.css.Cursor
import kotlinx.css.PointerEvents
import kotlinx.css.UserSelect
import kotlinx.css.background
import kotlinx.css.color
import kotlinx.css.cursor
import kotlinx.css.lineHeight
import kotlinx.css.minHeight
import kotlinx.css.opacity
import kotlinx.css.pct
import kotlinx.css.pointerEvents
import kotlinx.css.properties.LineHeight
import kotlinx.css.userSelect
import kotlinx.css.vh
import kotlinx.css.width
import kotlinx.css.zIndex

fun Routing.appCss() {
    get("/app.css") {
        call.respondCss(CssBuilder::appCss)
    }
}

private fun CssBuilder.appCss() {
    rule("*") {
        color = Color("#D1DAE0")
        lineHeight = LineHeight("76.4%")
    }
    rule("body") {
        put("all", "unset")
        background = "#000000"
    }
    rule(".section") {
        minHeight = 100.vh
    }
    rule(".default-gradient") {
        background = "conic-gradient(from 220deg at 35.12% 73.82%, #001C30 0deg, rgba(0, 28, 48, 0.00) 344.6943712234497deg)"
        zIndex = -1
    }
    rule(".unselectable") {
        put("-webkit-user-select", "none")
        userSelect = UserSelect.none
    }
    rule(".cursor-pointer") {
        cursor = Cursor.pointer
    }
    rule(".invisible") {
        opacity = 0
    }
    rule(".visible") {
        opacity = 1
    }
    rule(".pointer-events-none") {
        pointerEvents = PointerEvents.none
    }
    rule(".width-half") {
        width = 50.pct
    }
    textCss()
    headerCss()
    backdropCss()
    drawerCss()
    flexBoxCss()
}
