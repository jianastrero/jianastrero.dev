package dev.jianastrero.theme

import kotlinx.html.HEAD
import kotlinx.html.link

fun HEAD.defineFont() {
    link(rel = "preconnect", href = "https://fonts.googleapis.com")
    link(rel = "preconnect", href = "https://fonts.gstatic.com") {
        attributes["crossorigin"] = "true"
    }
    link(rel = "stylesheet", href = "https://fonts.googleapis.com/css2?family=Montserrat:wght@400;900&display=swap")

    link(rel = "stylesheet", href = "font.css")
}
