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
import com.acasloa946.finalproject.adminpanelframe.AdminPanel
import com.acasloa946.finalproject.adminpanelframe.BotonEspec
import com.acasloa946.finalproject.adminpanelframe.CheckBox
import com.acasloa946.finalproject.adminpanelframe.FrameCheckBox
import com.acasloa946.finalproject.adminpanelframe.FrameOutlinedName
import com.acasloa946.finalproject.adminpanelframe.FrameOutlinedPublisher
import com.acasloa946.finalproject.adminpanelframe.FrameOutlinedYear
import com.acasloa946.finalproject.adminpanelframe.Guardar
import com.acasloa946.finalproject.adminpanelframe.Line1
import com.acasloa946.finalproject.adminpanelframe.TextAdmin
import com.acasloa946.finalproject.adminpanelframe.TextCheckBox
import com.acasloa946.finalproject.adminpanelframe.TopLevel


@Composable
fun AdminScreen(viewmodelAdmin: ViewmodelAdmin, navController: NavController) {
    val name = viewmodelAdmin.name
    val publisher = viewmodelAdmin.publisher
    val year = viewmodelAdmin.year
    val indie = viewmodelAdmin.indie

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
            AdminPanelFrameComponent(modifier = Modifier.size(430.dp,885.dp),
                onLoginClick = {
                    viewmodelAdmin.añadirBDD(name,publisher,year,indie,context, onSuccess = {
                        Toast.makeText(context,"El videojuego se ha introducido correctamente",Toast.LENGTH_SHORT).show()
                    }, onFailure = {
                        Toast.makeText(context,"El videojuego no ha podido introducirse.",Toast.LENGTH_SHORT).show()
                    })

                },
                name,publisher,year.toString(),indie,
                viewmodelAdmin)
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
fun AdminPanelFrameComponent(
    modifier: Modifier = Modifier,
    onLoginClick: () -> Unit = {},
    name: String,
    publisher:String,
    year:String,
    indie:Boolean,
    viewmodelAdmin: ViewmodelAdmin
) {

    TopLevel(modifier = modifier) {
        AdminPanel(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        ) {
            BotonEspec(
                onLoginClick = onLoginClick,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 77.5.dp
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
                        y = -12.5.dp
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
            FrameOutlinedYear(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -76.5.dp
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
            Spacer(modifier = Modifier.padding(7.dp))
            FrameOutlinedPublisher(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -141.5.dp
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
            Spacer(modifier = Modifier.padding(7.dp))
            FrameOutlinedName(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -206.5.dp
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
            Spacer(modifier = Modifier.padding(7.dp))
            Line1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -361.0.dp
                    )
                )
            )
            TextAdmin(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -1.0.dp,
                        y = -403.5.dp
                    )
                )
            )
        }
    }
}





