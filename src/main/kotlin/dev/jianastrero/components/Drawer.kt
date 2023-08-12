package dev.jianastrero.components

import dev.jianastrero.Constants
import kotlinx.html.BODY
import kotlinx.html.a
import kotlinx.html.div
import kotlinx.html.id
import kotlinx.html.span

fun BODY.appDrawer() {
    div("backdrop invisible") {
        id = "backdrop"
    }
    div(classes = "drawer drawer-hidden") {
        id = "drawer"
        div(classes = "drawer-item") {
            a(Constants.BASE_URL, classes = "text-small") {
                +"Home"
            }
            span()
        }
        div(classes = "drawer-item") {
            a(Constants.BASE_URL, classes = "text-small") {
                +"About"
            }
            span()
        }
        div(classes = "drawer-item") {
            a(Constants.BASE_URL, classes = "text-small") {
                +"Projects"
            }
            span()
        }
        div(classes = "drawer-item") {
            a(Constants.BASE_URL, classes = "text-small") {
                +"Contact"
            }
            span()
        }
    }
}
