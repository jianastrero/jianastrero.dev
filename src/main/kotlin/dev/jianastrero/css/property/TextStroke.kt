package dev.jianastrero.css.property

import kotlinx.css.CssBuilder

fun CssBuilder.textStroke(value: String) {
    put("-webkit-text-strokes", value)
}
