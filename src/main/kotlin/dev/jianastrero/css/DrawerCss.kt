package dev.jianastrero.css

import kotlinx.css.Color
import kotlinx.css.CssBuilder
import kotlinx.css.Cursor
import kotlinx.css.Display
import kotlinx.css.FlexDirection
import kotlinx.css.LinearDimension
import kotlinx.css.ListStyleType
import kotlinx.css.Padding
import kotlinx.css.Position
import kotlinx.css.background
import kotlinx.css.backgroundColor
import kotlinx.css.cursor
import kotlinx.css.display
import kotlinx.css.flexDirection
import kotlinx.css.height
import kotlinx.css.listStyleType
import kotlinx.css.marginTop
import kotlinx.css.padding
import kotlinx.css.pct
import kotlinx.css.position
import kotlinx.css.properties.TextDecoration
import kotlinx.css.px
import kotlinx.css.rem
import kotlinx.css.right
import kotlinx.css.textDecoration
import kotlinx.css.top
import kotlinx.css.width
import kotlinx.css.zIndex

fun CssBuilder.drawerCss() {
    val drawerWidth = 24.rem
    rule(".drawer") {
        put("all", "unset")
        position = Position.fixed
        top = 0.px
        right = 0.px
        width = drawerWidth - 6.rem
        height = LinearDimension("100%") - 12.rem
        background = "#001C30"
        zIndex = 99
        listStyleType = ListStyleType.none
        padding = Padding(9.rem, 3.rem, 3.rem, 3.rem)
        display = Display.flex
        flexDirection = FlexDirection.column
        put("transition", "right 0.5s ease-in-out")
    }
    rule(".drawer-item:not(:first-child)") {
        marginTop = 2.rem
    }
    rule(".drawer-item") {
        put("all", "unset")
        cursor = Cursor.pointer
    }
    rule(".drawer-item > *") {
        textDecoration = TextDecoration.none
    }
    rule(".drawer-item:hover > span") {
        width = 100.pct
    }
    rule(".drawer-item > span") {
        right = 0.px
        height = 0.2.rem
        width = 0.pct
        marginTop = 0.2.rem
        backgroundColor = Color("#D1DAE0").withAlpha(0.5)
        display = Display.block
        put("transition", "width 0.3s ease-in-out")
    }
    rule(".drawer-hidden") {
        right = -drawerWidth
    }
}
