package dev.jianastrero.components

import kotlinx.html.BODY
import kotlinx.html.br
import kotlinx.html.div
import kotlinx.html.header
import kotlinx.html.id
import kotlinx.html.span

fun BODY.appHeader() {
    header {
        div(classes = "header-item unselectable") {
            span(classes = "text-weight-black text-xsmall") {
                +"Jian"
                br()
                +"Astrero"
            }
            br()
            span(classes = "text-weight-black text-xsmall") {
                +"Portfolio"
                br()
                +"Website"
            }
        }
        div(classes = "header-item") {
            div("cursor-pointer") {
                id = "burgerIcon"
            }
        }
    }
}
