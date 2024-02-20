package com.acasloa946.finalproject.userInterface.AdminScreen

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Checkbox
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.text.isDigitsOnly
import androidx.navigation.NavController
import com.acasloa946.finalproject.pantallaadminpl.FrameCheckBoxPS
import com.acasloa946.finalproject.pantallaadminpl.FrameCheckBoxXbox
import com.acasloa946.finalproject.pantallaadminpl.FrameCheckboxNintendo
import com.acasloa946.finalproject.pantallaadminpl.FrameNintendo
import com.acasloa946.finalproject.pantallaadminpl.FramePS
import com.acasloa946.finalproject.pantallaadminpl.FrameXbox
import com.acasloa946.finalproject.pantallaadminpl.Line1
import com.acasloa946.finalproject.pantallaadminpl.NintendoLogo
import com.acasloa946.finalproject.pantallaadminpl.Plataformas
import com.acasloa946.finalproject.pantallaadminpl.PlatformFrame
import com.acasloa946.finalproject.pantallaadminpl.PlaystationLogo
import com.acasloa946.finalproject.pantallaadminpl.TextAdmin
import com.acasloa946.finalproject.pantallaadminpl.VectorNintendo
import com.acasloa946.finalproject.pantallaadminpl.VectorPS
import com.acasloa946.finalproject.pantallaadminpl.VectorXbox
import com.acasloa946.finalproject.pantallaadminpl.XboxLogo


@Composable
fun AdminScreen(viewmodelAdmin: ViewmodelAdmin, navController: NavController) {
    val name = viewmodelAdmin.name
    val publisher = viewmodelAdmin.publisher
    val year = viewmodelAdmin.year
    val indie = viewmodelAdmin.indie
    val price = viewmodelAdmin.price
    val platforms = viewmodelAdmin.platforms


    val context = LocalContext.current

    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .background(Color.White)
                .verticalScroll(
                    rememberScrollState(10000),
                    enabled = true,
                    reverseScrolling = true
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            PantallaAdminComponent(modifier = Modifier.size(430.dp,1105.dp), onSaveClick = {
                viewmodelAdmin.añadirBDD(name, publisher, year, indie, context,price,platforms, onSuccess = {
                    Toast.makeText(
                        context,
                        "El videojuego se ha guardado correctamente",
                        Toast.LENGTH_SHORT
                    ).show()
                    viewmodelAdmin.changeName("")
                    viewmodelAdmin.changeIndie(false)
                    viewmodelAdmin.changePublisher("")
                    viewmodelAdmin.changePrice("")
                    viewmodelAdmin.changeYear(0)

                }, onFailure = {
                    Toast.makeText(
                        context,
                        "El videojuego no ha podido guardarse.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                )
            },name,publisher,year.toString(),indie,price,viewmodelAdmin)




        }
        Box(
            modifier = Modifier
                .size(width = 430.dp, height = 60.dp)
                .align(Alignment.BottomCenter)

        ) {


        }
    }
}






@Composable
fun PantallaAdminComponent(
    modifier: Modifier = Modifier,
    onSaveClick: () -> Unit = {},
    name: String,
    publisher:String,
    year:String,
    indie:Boolean,
    price:String,
    viewmodelAdmin: ViewmodelAdmin
) {
    com.acasloa946.finalproject.pantallaadminpl.TopLevel(modifier = modifier) {
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
        com.acasloa946.finalproject.pantallaadminpl.FrameOutlinedName(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -325.5.dp
                )
            )
        ) {
            androidx.compose.material3.OutlinedTextField(value = name, onValueChange = {
                viewmodelAdmin.changeName(it)
            },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFF1ACE4D),
                    unfocusedBorderColor = Color.Black,
                    focusedLabelColor = Color.Black,
                    unfocusedLabelColor = Color.Black,
                    unfocusedTextColor = Color.Black,
                    focusedTextColor = Color.Black
                ),
                label = {
                    Text("Nombre del videojuego", color = Color.Black, fontSize = 13.sp)
                },
                modifier = Modifier.fillMaxSize())
        }
        com.acasloa946.finalproject.pantallaadminpl.FrameOutlinedPublisher(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -199.5.dp
                )
            )
        ) {
            androidx.compose.material3.OutlinedTextField(value = publisher, onValueChange = {
                viewmodelAdmin.changePublisher(it)
            },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFF1ACE4D),
                    unfocusedBorderColor = Color.Black,
                    focusedLabelColor = Color.Black,
                    unfocusedLabelColor = Color.Black,
                    unfocusedTextColor = Color.Black,
                    focusedTextColor = Color.Black
                ),
                label = {
                    Text("Publisher del videojuego", color = Color.Black, fontSize = 13.sp)
                },
                modifier = Modifier.height(300.dp))
        }
        com.acasloa946.finalproject.pantallaadminpl.FrameOutlinedYear(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -73.5.dp
                )
            )
        ) {
            androidx.compose.material3.OutlinedTextField(value = year, onValueChange = {
                try {
                    if (it.isDigitsOnly() || it != "") {
                        viewmodelAdmin.changeYear(it.toInt())
                    }
                }
                catch (e:Exception) {
                    Log.d("","")
                }
            },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFF1ACE4D),
                    unfocusedBorderColor = Color.Black,
                    focusedLabelColor = Color.Black,
                    unfocusedLabelColor = Color.Black,
                    unfocusedTextColor = Color.Black,
                    focusedTextColor = Color.Black
                ),
                label = {
                    Text("Año de lanzamiento", color = Color.Black, fontSize = 13.sp)
                },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number
                ),
                modifier = Modifier.fillMaxSize())
        }
        com.acasloa946.finalproject.pantallaadminpl.FrameOutlinedPrice(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 52.5.dp
                )
            )
        ) {
            androidx.compose.material3.OutlinedTextField(value = price.toString(), onValueChange = {
                viewmodelAdmin.changePrice(it)
            },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFF1ACE4D),
                    unfocusedBorderColor = Color.Black,
                    focusedLabelColor = Color.Black,
                    unfocusedLabelColor = Color.Black,
                    unfocusedTextColor = Color.Black,
                    focusedTextColor = Color.Black
                ),
                label = {
                    Text("Precio del videojuego", color = Color.Black, fontSize = 13.sp)
                },
                modifier = Modifier.height(300.dp))
        }
        com.acasloa946.finalproject.pantallaadminpl.CheckBox(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = 136.5.dp
                )
            )
        ) {
            com.acasloa946.finalproject.pantallaadminpl.TextCheckBox()
            com.acasloa946.finalproject.pantallaadminpl.FrameCheckBox {
                androidx.compose.material3.Switch(
                    checked = indie, onCheckedChange = { viewmodelAdmin.changeIndie(it) },
                    modifier = Modifier
                        .width(52.dp)
                        .height(32.dp)
                        .background(
                            color = Color(0xFFFFFFFF),
                            shape = RoundedCornerShape(size = 100.dp)
                        )
                        .padding(start = 2.dp, top = 2.dp, end = 2.dp, bottom = 2.dp),
                    colors = androidx.compose.material3.SwitchDefaults.colors(checkedTrackColor = Color(0xFF1ACE4D)))
            }
        }
        com.acasloa946.finalproject.pantallaadminpl.BotonEspec(
            onSaveClick = onSaveClick,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 501.5.dp
                )
            )
        ) {
            com.acasloa946.finalproject.pantallaadminpl.Guardar(
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
                ) {
                    Checkbox (checked = viewmodelAdmin.nintendo , onCheckedChange = {
                        viewmodelAdmin.changeNintendo(it)
                    })
                }
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
                ) {
                    Checkbox (checked =viewmodelAdmin.ps5 , onCheckedChange = {
                        viewmodelAdmin.changePs5(it)
                    })
                }
                PlaystationLogo(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -23.5.dp,
                            y = -0.5.dp
                        )
                    )
                ) {
                    VectorPS(modifier = Modifier
                        .rowWeight(1.0f)
                        .columnWeight(1.0f))
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
                ) {
                    Checkbox (checked =viewmodelAdmin.xbox , onCheckedChange = {
                        viewmodelAdmin.changeXbox(it)
                    })
                }
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