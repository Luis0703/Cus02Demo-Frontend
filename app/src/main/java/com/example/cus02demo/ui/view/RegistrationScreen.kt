package com.example.cus02demo.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cus02demo.ui.theme.backgroundPrincipal

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun RegistrationScreen(navController: NavHostController) {
    Surface(
        color = Color.Blue,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue)
            .padding(28.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            // Colocar el NormalTextComponent en la parte superior de la pantalla
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                NormalTextComponent(value = "SISVITA")
            }

            // Spacer para empujar los demás componentes hacia abajo
            Spacer(modifier = Modifier.height(60.dp))

            // El resto de la pantalla
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    HeadingTextComponent(value = "Crea una cuenta gratis")
                }
                Spacer(modifier = Modifier.height(25.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    MyTextFieldComponent(labelValue = "¿Que nombre quieres usar?", icon = Icons.Outlined.Person)
                    Spacer(modifier = Modifier.height(10.dp))
                    MyTextFieldComponent(labelValue = "Email", icon = Icons.Outlined.Email)
                    Spacer(modifier = Modifier.height(10.dp))
                    PasswordTextFieldComponent(labelValue = "Contraseña", icon = Icons.Outlined.Lock)
                    Spacer(modifier = Modifier.height(10.dp))
                    PasswordTextFieldComponent(labelValue = "Repetir Contraseña", icon = Icons.Outlined.Lock)
                    Spacer(modifier = Modifier.height(20.dp))
                    Button(
                        onClick = { /* Acción de registro */ },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Crear Cuenta")
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                /*BottomComponent(
                    textQuery = "¿Ya tienes una cuenta?",
                    textClickable = "Inicia Sesión",
                    action = "Register",
                    navController = navController
                )*/
            }
        }
    }
}

@Composable
fun Normal1TextComponent(value: String) {
    Text(
        text = value,
        fontSize = 28.sp,
        color = Color.Yellow,
        textAlign = TextAlign.Start,
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun Heading1TextComponent(value: String) {
    Text(
        text = value,
        fontSize = 24.sp,
        color = Color.Yellow,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )
}

@Composable
fun MyTextField1Component(labelValue: String, icon: ImageVector) {
    TextField(
        value = "",
        onValueChange = { /* Handle text change */ },
        label = { Text(labelValue) },
        leadingIcon = {
            Icon(
                imageVector = icon,
                contentDescription = labelValue
            )
        },
        modifier = Modifier.fillMaxWidth(),
        singleLine = true
    )
}

@Composable
fun PasswordTextField1Component(labelValue: String, icon: ImageVector) {
    TextField(
        value = "",
        onValueChange = { /* Handle text change */ },
        label = { Text(labelValue) },
        leadingIcon = {
            Icon(
                imageVector = icon,
                contentDescription = labelValue
            )
        },
        visualTransformation = PasswordVisualTransformation(),
        modifier = Modifier.fillMaxWidth(),
        singleLine = true
    )
}

@Composable
fun Bottom1Component(
    textQuery: String,
    textClickable: String,
    action: String,
    navController: NavHostController
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(text = textQuery)
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = textClickable,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.clickable {
                // Acción de navegación
                navController.navigate("login")
            }
        )
    }
}
@Preview(showBackground = true)
@Composable
fun RegistrationScreenPreview() {
    RegistrationScreen(navController = rememberNavController())
}