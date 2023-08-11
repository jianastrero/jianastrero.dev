package dev.jianastrero.templating.css

import kotlinx.css.CssValue

fun cssValue(value: String) = object : CssValue(value) {}
