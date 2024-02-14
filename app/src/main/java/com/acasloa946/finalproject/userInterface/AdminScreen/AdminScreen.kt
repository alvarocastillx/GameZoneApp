package com.acasloa946.finalproject.userInterface.AdminScreen

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
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
import com.acasloa946.finalproject.pantallaadmin.BannerText
import com.acasloa946.finalproject.pantallaadmin.BotonEspec
import com.acasloa946.finalproject.pantallaadmin.CheckBox
import com.acasloa946.finalproject.pantallaadmin.FrameCheckBox
import com.acasloa946.finalproject.pantallaadmin.FrameOutlinedName
import com.acasloa946.finalproject.pantallaadmin.FrameOutlinedPrice
import com.acasloa946.finalproject.pantallaadmin.FrameOutlinedPublisher
import com.acasloa946.finalproject.pantallaadmin.FrameOutlinedYear
import com.acasloa946.finalproject.pantallaadmin.Guardar
import com.acasloa946.finalproject.pantallaadmin.LineDivisoria
import com.acasloa946.finalproject.pantallaadmin.PantallaAdmin
import com.acasloa946.finalproject.pantallaadmin.TextCheckBox
import com.acasloa946.finalproject.pantallaadmin.TopLevel
import com.google.relay.compose.BoxScopeInstance.boxAlign


@Composable
fun AdminScreen(viewmodelAdmin: ViewmodelAdmin, navController: NavController) {
    val name = viewmodelAdmin.name
    val publisher = viewmodelAdmin.publisher
    val year = viewmodelAdmin.year
    val indie = viewmodelAdmin.indie
    val price = viewmodelAdmin.price

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

            PantallaAdminComponent(modifier = Modifier.size(430.dp,834.dp), onSvClick = {
                viewmodelAdmin.añadirBDD(name, publisher, year, indie, context,price, onSuccess = {
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
            },name,publisher,year.toString(),indie,price.toString(),viewmodelAdmin)
                

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
    onSvClick: () -> Unit = {},
    name: String,
    publisher:String,
    year:String,
    indie:Boolean,
    price:String,
    viewmodelAdmin: ViewmodelAdmin
) {
    TopLevel(modifier = modifier) {
        BotonEspec(
            onSvClick = onSvClick,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 349.0.dp
                )
            )
        ) {
            Guardar(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -0.5.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        CheckBox(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.5.dp,
                    y = 235.0.dp
                )
            )
        ) {
            TextCheckBox()
            FrameCheckBox {
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
        FrameOutlinedPrice(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 112.0.dp
                )
            )
        ) {
            //////////////////////PRICE/////////////////////////
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
        FrameOutlinedYear(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -12.0.dp
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
        FrameOutlinedPublisher(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -136.0.dp
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
        FrameOutlinedName(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -260.0.dp
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
        LineDivisoria(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -344.0.dp
                )
            )
        )
        BannerText(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -378.5.dp
                )
            )
        )
    }
}


/*
@Composable
fun PantallaAdminComponent(
    modifier: Modifier = Modifier,
    onSvClick: () -> Unit = {},
    name: String,
    publisher:String,
    year:String,
    indie:Boolean,
    viewmodelAdmin: ViewmodelAdmin
) {
    TopLevel(modifier = modifier) {
        BotonEspec(
            onSvClick = onSvClick,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 133.0.dp,
                    y = 796.0.dp
                )
            )
        ) {
            Guardar(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -0.5.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        CheckBox(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 146.0.dp,
                    y = 674.0.dp
                )
            )
        ) {
            TextCheckBox()
            FrameCheckBox {
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
        FrameOutlinedPrice(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 110.0.dp,
                    y = 550.0.dp
                )
            )
        ) {

        }
        FrameOutlinedYear(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 110.0.dp,
                    y = 426.0.dp
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
                modifier = Modifier.fillMaxWidth())
        }
        FrameOutlinedPublisher(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 110.0.dp,
                    y = 302.0.dp
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
                modifier = Modifier.fillMaxWidth())
        }
        FrameOutlinedName(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 110.0.dp,
                    y = 178.0.dp
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
                modifier = Modifier.fillMaxWidth())
        }
        }
        LineDivisoria(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -358.0.dp
                )
            )
        )
        BannerText(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopCenter,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 38.0.dp
                )
            )
        )
    }



 */




