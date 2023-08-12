package dev.jianastrero.util

fun String.removeSpaces() = replace("\\s+".toRegex(), "")
