package com.acasloa946.finalproject.pantallaadminpl

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.acasloa946.finalproject.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'pantalla_admin_pl'.
 * Generated code; do not edit directly
 */
@Composable
fun PantallaAdminPl(
    modifier: Modifier = Modifier,
    onSaveClick: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        TextAdmin(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -507.5.dp
                )
            )
        )
        Line1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 1.0.dp,
                    y = -457.0.dp
                )
            )
        )
        FrameOutlinedName(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -325.5.dp
                )
            )
        ) {}
        FrameOutlinedPublisher(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -199.5.dp
                )
            )
        ) {}
        FrameOutlinedYear(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -73.5.dp
                )
            )
        ) {}
        FrameOutlinedPrice(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 52.5.dp
                )
            )
        ) {}
        CheckBox(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = 136.5.dp
                )
            )
        ) {
            TextCheckBox()
            FrameCheckBox {}
        }
        BotonEspec(
            onSaveClick = onSaveClick,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 501.5.dp
                )
            )
        ) {
            Guardar(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -0.5.dp,
                        y = 0.5.dp
                    )
                )
            )
        }
        PlatformFrame(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.5.dp,
                    y = 298.0.dp
                )
            )
        ) {
            FrameNintendo(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 1.0.dp,
                        y = 81.5.dp
                    )
                )
            ) {
                NintendoLogo(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -23.5.dp,
                            y = 0.0.dp
                        )
                    )
                ) {
                    VectorNintendo(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.0009632110595703125.dp
                            )
                        )
                    )
                }
                FrameCheckboxNintendo(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 23.5.dp,
                            y = 0.0.dp
                        )
                    )
                ) {}
            }
            FramePS(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 1.0.dp,
                        y = -36.0.dp
                    )
                )
            ) {
                FrameCheckBoxPS(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 23.5.dp,
                            y = 0.5.dp
                        )
                    )
                ) {}
                PlaystationLogo(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -23.5.dp,
                            y = -0.5.dp
                        )
                    )
                ) {
                    VectorPS(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                }
            }
            FrameXbox(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 3.5.dp,
                        y = 25.5.dp
                    )
                )
            ) {
                FrameCheckBoxXbox(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 21.0.dp,
                            y = 0.0.dp
                        )
                    )
                ) {}
                XboxLogo(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -26.0.dp,
                            y = -3.0.dp
                        )
                    )
                ) {
                    VectorXbox(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 0.0001697540283203125.dp,
                                y = -0.0003261566162109375.dp
                            )
                        )
                    )
                }
            }
            Plataformas(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -90.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 430, heightDp = 1105)
@Composable
private fun PantallaAdminPlPreview() {
    MaterialTheme {
        RelayContainer {
            PantallaAdminPl(
                onSaveClick = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun TextAdmin(modifier: Modifier = Modifier) {
    RelayText(
        content = "PANEL DE ADMINISTRADOR",
        fontSize = 30.0.sp,
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 0,
            green = 235,
            blue = 100
        ),
        height = 1.481999969482422.em,
        letterSpacing = 3.3.sp,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Line1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pantalla_admin_pl_line_1),
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(1.0.dp)
    )
}

@Composable
fun FrameOutlinedName(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(210.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun FrameOutlinedPublisher(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(210.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun FrameOutlinedYear(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(210.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun FrameOutlinedPrice(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(210.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun TextCheckBox(modifier: Modifier = Modifier) {
    RelayText(
        content = "¿Indie?",
        fontSize = 15.0.sp,
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.481999969482422.em,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier
    )
}

@Composable
fun FrameCheckBox(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        clipToParent = false,
        radius = 33.0,
        content = content,
        modifier = modifier.requiredWidth(52.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun CheckBox(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(all = 11.0.dp),
        itemSpacing = 9.0,
        clipToParent = false,
        radius = 100.0,
        content = content,
        modifier = modifier.requiredWidth(139.0.dp).requiredHeight(54.0.dp)
    )
}

@Composable
fun Guardar(modifier: Modifier = Modifier) {
    RelayText(
        content = "Guardar",
        fontSize = 21.0.sp,
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4819999876476466.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(103.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun BotonEspec(
    onSaveClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        radius = 15.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.tappable(onTap = onSaveClick).requiredWidth(164.0.dp).requiredHeight(38.0.dp)
    )
}

@Composable
fun VectorNintendo(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pantalla_admin_pl_vector_nintendo),
        modifier = modifier.requiredWidth(48.0.dp).requiredHeight(11.85007095336914.dp)
    )
}

@Composable
fun NintendoLogo(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(48.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun FrameCheckboxNintendo(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(48.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun FrameNintendo(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(95.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun FrameCheckBoxPS(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(48.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun VectorPS(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pantalla_admin_pl_vector_ps),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 1.56005859375.dp,
                top = 8.0.dp,
                end = 2.4400978088378906.dp,
                bottom = 6.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun PlaystationLogo(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(48.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun FramePS(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(95.0.dp).requiredHeight(49.0.dp)
    )
}

@Composable
fun FrameCheckBoxXbox(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(48.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun VectorXbox(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.pantalla_admin_pl_vector_xbox),
        modifier = modifier.requiredWidth(38.00033950805664.dp).requiredHeight(37.99934768676758.dp)
    )
}

@Composable
fun XboxLogo(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(38.0.dp).requiredHeight(38.0.dp)
    )
}

@Composable
fun FrameXbox(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(90.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun Plataformas(modifier: Modifier = Modifier) {
    RelayText(
        content = "Plataformas",
        fontSize = 21.0.sp,
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4819999876476466.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(103.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun PlatformFrame(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(103.0.dp).requiredHeight(211.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 217,
            green = 217,
            blue = 217
        ),
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
