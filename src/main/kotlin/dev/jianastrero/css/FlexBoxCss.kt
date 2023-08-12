package dev.jianastrero.css

import kotlinx.css.Align
import kotlinx.css.CssBuilder
import kotlinx.css.Flex
import kotlinx.css.FlexDirection
import kotlinx.css.JustifyContent
import kotlinx.css.alignItems
import kotlinx.css.alignSelf
import kotlinx.css.display
import kotlinx.css.flex
import kotlinx.css.flexDirection
import kotlinx.css.justifyContent

fun CssBuilder.flexBoxCss() {
    rule(".flex") {
        display = kotlinx.css.Display.flex
    }

    rule(".flex-one") {
        flex = Flex("1")
    }

    // Flex Direction
    rule(".flex-row") {
        flexDirection = FlexDirection.row
    }
    rule(".flex-column") {
        flexDirection = FlexDirection.column
    }

    // Flex
    rule(".flex-center") {
        alignItems = Align.center
        justifyContent = JustifyContent.center
    }
    rule(".flex-start") {
        alignItems = Align.flexStart
        justifyContent = JustifyContent.flexStart
    }
    rule(".flex-end") {
        alignItems = Align.flexEnd
        justifyContent = JustifyContent.flexEnd
    }

    // Align Items
    rule(".align-items-center") {
        alignItems = Align.center
    }
    rule(".align-items-flex-start") {
        alignItems = Align.flexStart
    }
    rule(".align-items-flex-end") {
        alignItems = Align.flexEnd
    }
    rule(".align-items-initial") {
        alignItems = Align.initial
    }
    rule(".align-items-stretch") {
        alignItems = Align.stretch
    }
    rule(".align-items-baseline") {
        alignItems = Align.baseline
    }

    // Justify Content
    rule(".justify-content-center") {
        justifyContent = JustifyContent.center
    }
    rule(".justify-content-space-between") {
        justifyContent = JustifyContent.spaceBetween
    }
    rule(".justify-content-space-around") {
        justifyContent = JustifyContent.spaceAround
    }
    rule(".justify-content-space-evenly") {
        justifyContent = JustifyContent.spaceEvenly
    }
    rule(".justify-content-flex-start") {
        justifyContent = JustifyContent.flexStart
    }
    rule(".justify-content-flex-end") {
        justifyContent = JustifyContent.flexEnd
    }
    rule(".justify-content-initial") {
        justifyContent = JustifyContent.initial
    }

    // Align Self
    rule(".align-self-auto") {
        alignSelf = Align.auto
    }
    rule(".align-self-center") {
        alignSelf = Align.center
    }
    rule(".align-self-flex-start") {
        alignSelf = Align.flexStart
    }
    rule(".align-self-flex-end") {
        alignSelf = Align.flexEnd
    }
    rule(".align-self-initial") {
        alignSelf = Align.initial
    }
    rule(".align-self-stretch") {
        alignSelf = Align.stretch
    }
    rule(".align-self-baseline") {
        alignSelf = Align.baseline
    }
}
