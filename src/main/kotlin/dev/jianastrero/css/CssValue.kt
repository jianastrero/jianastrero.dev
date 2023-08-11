package dev.jianastrero.css

import kotlinx.css.CssValue

fun cssValue(value: String) = object : CssValue(value) {
    override fun toString(): String = value
}
