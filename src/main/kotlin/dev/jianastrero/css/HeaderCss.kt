package dev.jianastrero.css

import kotlinx.css.CssBuilder
import kotlinx.css.Display
import kotlinx.css.JustifyContent
import kotlinx.css.LinearDimension
import kotlinx.css.Padding
import kotlinx.css.Position
import kotlinx.css.display
import kotlinx.css.height
import kotlinx.css.justifyContent
import kotlinx.css.left
import kotlinx.css.padding
import kotlinx.css.position
import kotlinx.css.px
import kotlinx.css.rem
import kotlinx.css.top
import kotlinx.css.width
import kotlinx.css.zIndex

fun CssBuilder.headerCss() {
    rule("header") {
        zIndex = 100
        position = Position.absolute
        top = 0.px
        left = 0.px
        display = Display.flex
        width = LinearDimension("100%")
        justifyContent = JustifyContent.spaceBetween

        rule(".header-item") {
            padding = Padding(1.5.rem)
        }

        rule("#burgerIcon") {
            width = 3.rem
            height = 3.rem
        }
    }
}
