package dev.jianastrero.pages.template

import dev.jianastrero.Constants
import dev.jianastrero.components.appHeader
import dev.jianastrero.template.BaseTemplate
import dev.jianastrero.theme.defineFont
import kotlinx.html.BODY
import kotlinx.html.HEAD
import kotlinx.html.ScriptType
import kotlinx.html.link
import kotlinx.html.script
import kotlinx.html.unsafe

class SiteTemplate(title: String) : BaseTemplate(title) {
    override fun HEAD.beforeHead() {
        link(rel = "stylesheet", href = "app.css")
        defineFont()
        script(
            type = ScriptType.textJavaScript,
            src = "https://cdnjs.cloudflare.com/ajax/libs/bodymovin/5.7.4/lottie.min.js"
        ) {}
        script(
            type = ScriptType.textJavaScript,
            src = "https://unpkg.com/@lottiefiles/lottie-player@latest/dist/lottie-player.js"
        ) {}
        script(
            type = ScriptType.textJavaScript,
            src = "https://unpkg.com/@lottiefiles/lottie-interactivity@latest/dist/lottie-interactivity.min.js"
        ) {}
    }

    override fun HEAD.afterHead() {}

    override fun BODY.beforeBody() {
        appHeader()
    }

    override fun BODY.afterBody() {
        script(ScriptType.textJavaScript) {
            unsafe {
                +"""
                const burgerIcon = document.querySelector('#burgerIcon');
                var drawerOpen = false;
                const burgerAnimation = bodymovin.loadAnimation({
                    container: burgerIcon,
                    path: '${Constants.BASE_URL}/icon/burger.json',
                    renderer: 'svg',
                    loop: false,
                    autoplay: false
                });
                
                function playOpenAnimation() {
                    var totalFrames = burgerAnimation.totalFrames;
                    burgerAnimation.playSegments([[0, totalFrames], true]);
                }
                
                function playCloseAnimation() {
                    var totalFrames = burgerAnimation.totalFrames;
                    burgerAnimation.playSegments([[totalFrames, 0], true]);
                }
                
                burgerIcon.addEventListener('click', () => {
                    if (drawerOpen) {
                        playCloseAnimation();
                    } else {
                        playOpenAnimation();
                    }
                    drawerOpen = !drawerOpen;
                    console.log('drawerOpen', drawerOpen);
                });
            """.trimIndent()
            }
        }
    }
}
