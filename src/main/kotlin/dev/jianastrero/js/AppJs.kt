package dev.jianastrero.js

import dev.jianastrero.Constants
import kotlinx.html.BODY
import kotlinx.html.ScriptType
import kotlinx.html.script
import kotlinx.html.unsafe

fun BODY.appJs() {
    script(ScriptType.textJavaScript) {
        unsafe {
            +"""
                const burgerIcon = document.querySelector('#burgerIcon');
                const backdrop = document.querySelector('#backdrop');
                const drawer = document.querySelector('#drawer');

                var drawerOpen = false;

                const burgerAnimation = bodymovin.loadAnimation({
                    container: burgerIcon,
                    path: '${Constants.BASE_URL}/icon/burger.json',
                    renderer: 'svg',
                    loop: false,
                    autoplay: false
                });
                
                function showDrawer() {
                    backdrop.classList.remove('invisible');
                    backdrop.classList.add('visible');
                    backdrop.classList.add('pointer-events-none');
                    drawer.classList.remove('drawer-hidden');
                }
                
                function hideDrawer() {
                    backdrop.classList.remove('pointer-events-none');
                    backdrop.classList.remove('visible');
                    backdrop.classList.add('invisible');
                    drawer.classList.add('drawer-hidden');
                }
                
                function playOpenAnimation() {
                    const totalFrames = burgerAnimation.totalFrames;
                    drawerOpen = true;
                    burgerAnimation.playSegments([[0, totalFrames], false]);
                }

                function playCloseAnimation() {
                    const totalFrames = burgerAnimation.totalFrames;
                    drawerOpen = false;
                    burgerAnimation.playSegments([[totalFrames, 0], false]);
                }

                burgerIcon.addEventListener('click', () => {
                    if (drawerOpen) {
                        playCloseAnimation();
                        hideDrawer();
                    } else {
                        playOpenAnimation();
                        showDrawer();
                    }
                });
            """.trimIndent()
        }
    }
}
