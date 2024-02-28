package com.acasloa946.finalproject.infodialog

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.acasloa946.finalproject.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'info_dialog'.
 * Generated code; do not edit directly
 */
@Composable
fun InfoDialog(
    modifier: Modifier = Modifier,
    textEmail: String = "",
    textUser: String = "",
    onAcceptClick: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        AcceptButton(
            onAcceptClick = onAcceptClick,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 132.5.dp
                )
            )
        ) {
            Aceptar(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        MailTextBox(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.5.dp,
                    y = 63.5.dp
                )
            )
        ) {
            TextBoxMail(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            TextMail(
                textEmail = textEmail,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            IconMail(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -119.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                Vector(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.000020503997802734375.dp,
                            y = -0.000035762786865234375.dp
                        )
                    )
                )
            }
        }
        UserTextBox(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.5.dp,
                    y = 20.5.dp
                )
            )
        ) {
            TextBoxUsername(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            TextUser(
                textUser = textUser,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            IconUser(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -119.0.dp,
                        y = -1.0.dp
                    )
                )
            ) {
                UserVector(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.000020503997802734375.dp,
                            y = -0.000020503997802734375.dp
                        )
                    )
                )
            }
        }
        UserImage(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -106.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 358, heightDp = 416)
@Composable
private fun InfoDialogPreview() {
    MaterialTheme {
        RelayContainer {
            InfoDialog(
                onAcceptClick = {},
                textEmail = "e-mail",
                textUser = "username",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Aceptar(modifier: Modifier = Modifier) {
    RelayText(
        content = "Aceptar",
        fontSize = 17.0.sp,
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4820000143612133.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(192.0.dp).requiredHeight(31.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun AcceptButton(
    onAcceptClick: () -> Unit,
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
        modifier = modifier.tappable(onTap = onAcceptClick).requiredWidth(192.0.dp).requiredHeight(31.0.dp)
    )
}

@Composable
fun TextBoxMail(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.info_dialog_text_box_mail),
        modifier = modifier.requiredWidth(287.0.dp).requiredHeight(29.0.dp)
    )
}

@Composable
fun TextMail(
    textEmail: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = textEmail,
        fontSize = 13.0.sp,
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 0,
            green = 235,
            blue = 100
        ),
        height = 1.4820000575138972.em,
        letterSpacing = 1.43.sp,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(287.0.dp).requiredHeight(29.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.info_dialog_vector),
        modifier = modifier.requiredWidth(14.166666984558105.dp).requiredHeight(14.16667652130127.dp)
    )
}

@Composable
fun IconMail(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(17.0.dp).requiredHeight(17.0.dp)
    )
}

@Composable
fun MailTextBox(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(287.0.dp).requiredHeight(29.0.dp)
    )
}

@Composable
fun TextBoxUsername(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.info_dialog_text_box_username),
        modifier = modifier.requiredWidth(287.0.dp).requiredHeight(29.0.dp)
    )
}

@Composable
fun TextUser(
    textUser: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = textUser,
        fontSize = 13.0.sp,
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 0,
            green = 235,
            blue = 100
        ),
        height = 1.4820000575138972.em,
        letterSpacing = 1.43.sp,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(287.0.dp).requiredHeight(29.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun UserVector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.info_dialog_user_vector),
        modifier = modifier.requiredWidth(11.333333015441895.dp).requiredHeight(11.333333015441895.dp)
    )
}

@Composable
fun IconUser(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(17.0.dp).requiredHeight(17.0.dp)
    )
}

@Composable
fun UserTextBox(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(287.0.dp).requiredHeight(29.0.dp)
    )
}

@Composable
fun UserImage(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.info_dialog_user_image),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(146.0.dp).requiredHeight(146.0.dp)
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
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
