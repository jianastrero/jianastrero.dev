package dev.jianastrero.css

import kotlinx.css.CssBuilder
import kotlinx.css.FontWeight
import kotlinx.css.fontSize
import kotlinx.css.fontWeight
import kotlinx.css.rem

fun CssBuilder.textCss() {
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
}
