package dev.jianastrero.elements

import kotlinx.html.FlowContent
import kotlinx.html.HTMLTag
import kotlinx.html.TagConsumer
import kotlinx.html.visit

class LottiePlayer(
    consumer: TagConsumer<*>,
    id: String,
    src: String,
    background: String = "transparent",
    speed: String = "1",
    classes: String = ""
) : HTMLTag(
    "lottie-player",
    consumer,
    mapOf(
        "id" to id,
        "src" to src,
        "background" to background,
        "speed" to speed,
        "class" to classes
    ),
    inlineTag = true,
    emptyTag = false
)

fun FlowContent.lottiePlayer(
    id: String,
    src: String,
    background: String = "transparent",
    speed: String = "1",
    classes: String = "",
    block: LottiePlayer.() -> Unit = {}
) = LottiePlayer(consumer, id, src, background, speed, classes).visit(block)
