package dev.jianastrero.css

import dev.jianastrero.plugins.respondCss
import io.ktor.server.application.call
import io.ktor.server.routing.Routing
import io.ktor.server.routing.get
import kotlinx.css.Align
import kotlinx.css.Color
import kotlinx.css.CssBuilder
import kotlinx.css.Cursor
import kotlinx.css.Display
import kotlinx.css.FlexDirection
import kotlinx.css.FontWeight
import kotlinx.css.JustifyContent
import kotlinx.css.LinearDimension
import kotlinx.css.Margin
import kotlinx.css.Padding
import kotlinx.css.Position
import kotlinx.css.UserSelect
import kotlinx.css.alignItems
import kotlinx.css.background
import kotlinx.css.color
import kotlinx.css.cursor
import kotlinx.css.display
import kotlinx.css.flexDirection
import kotlinx.css.fontSize
import kotlinx.css.fontWeight
import kotlinx.css.height
import kotlinx.css.justifyContent
import kotlinx.css.left
import kotlinx.css.lineHeight
import kotlinx.css.margin
import kotlinx.css.minHeight
import kotlinx.css.padding
import kotlinx.css.position
import kotlinx.css.properties.LineHeight
import kotlinx.css.px
import kotlinx.css.rem
import kotlinx.css.top
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
        margin = Margin(0.px)
        padding = Padding(0.px)
        background = "#000000"
    }
    rule(".section") {
        display = Display.flex
        flexDirection = FlexDirection.column
        alignItems = Align.center
        justifyContent = JustifyContent.center
        minHeight = 100.vh
    }
    rule(".text-weight-black") {
        fontWeight = FontWeight.w900
    }
    rule(".text-xsmall") {
        fontSize = 1.5.rem
    }
    rule(".text-small") {
        fontSize = 2.rem
    }
    rule(".text-medium") {
        fontSize = 4.rem
    }
    rule(".text-large") {
        fontSize = 6.rem
    }
    rule(".text-xlarge") {
        fontSize = 8.rem
    }
    rule(".default-gradient") {
        background = "conic-gradient(from 220deg at 35.12% 73.82%, #001C30 0deg, rgba(0, 28, 48, 0.00) 344.6943712234497deg)"
        zIndex = -1
    }
    rule("header") {
        zIndex = 100
        position = Position.absolute
        top = 0.px
        left = 0.px
        display = Display.flex
        width = LinearDimension("100%")
        justifyContent = JustifyContent.spaceBetween
    }
    rule(".header-item") {
        padding = Padding(1.5.rem)
    }
    rule("#burgerIcon") {
        width = 3.rem
        height = 3.rem
    }
    rule(".unselectable") {
        userSelect = UserSelect.none
    }
    rule(".cursor-pointer") {
        cursor = Cursor.pointer
    }
}
