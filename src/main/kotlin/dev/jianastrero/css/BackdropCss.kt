package dev.jianastrero.css

import kotlinx.css.CssBuilder
import kotlinx.css.LinearDimension
import kotlinx.css.Position
import kotlinx.css.background
import kotlinx.css.height
import kotlinx.css.left
import kotlinx.css.opacity
import kotlinx.css.position
import kotlinx.css.px
import kotlinx.css.top
import kotlinx.css.width
import kotlinx.css.zIndex

fun CssBuilder.backdropCss() {
    rule(".backdrop") {
        position = Position.absolute
        top = 0.px
        left = 0.px
        width = LinearDimension("100%")
        height = LinearDimension("100%")
        background = "rgba(0, 0, 0, 0.5)"
        zIndex = 98
        put("transition", "opacity 0.5s ease-in-out")
    }
}
