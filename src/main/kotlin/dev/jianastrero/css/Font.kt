package dev.jianastrero.css

import kotlinx.css.CSSBuilder
import kotlinx.css.fontFamily

fun CSSBuilder.font() {
    rule("*") {
        fontFamily = "Montserrat, sans-serif"
    }
}
