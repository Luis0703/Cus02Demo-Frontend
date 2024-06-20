@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.cus02demo.ui.view

import android.annotation.SuppressLint
import android.graphics.ColorSpace.Rgb
import android.graphics.fonts.FontStyle
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cus02demo.R
import com.example.cus02demo.data.model.ConteoEstadoSolicitudItem
import com.example.cus02demo.model.TrackingCard
import com.example.cus02demo.navigation.AppScreen
import com.example.cus02demo.ui.standardQuadFromTo
import com.example.cus02demo.ui.theme.*

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
/*@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "MoENÚ",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color(8,83,148))
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "¡Bienvenido!",
                fontSize = 40.sp,
                color = Color(8,83,148),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.logo_condosa),
                contentDescription = null,
                modifier = Modifier.size(300.dp)
            )
            Text(
                text = "Seleccione una opción:",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 16.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            GridButtons(navController)
        }
    }
}

@Composable
fun GridButtons(navController: NavController) {
    val buttonColors = ButtonDefaults.buttonColors(Color(8, 83, 148))
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(onClick = { navController.navigate(route = AppScreen.trackingScreen.route) },modifier = Modifier.weight(1f),colors = buttonColors) {
                Text("Solicitudes")
            }
            Button(onClick = { /* NADA */ },modifier = Modifier.weight(1f),colors = buttonColors) {
                Text("Solicitantes")
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(onClick = { /* NADA */ },modifier = Modifier.weight(1f),colors = buttonColors) {
                Text("Predios")
            }
            Button(onClick = { /* NADA */ },modifier = Modifier.weight(1f),colors = buttonColors) {
                Text("Contratos")
            }
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    Cus02DemoTheme(darkTheme = false) {
        val navController = rememberNavController()
        HomeScreen(navController = navController)
    }
}*/

@Composable
fun HomeScreen(navController: NavHostController) {
    Surface(
        color = Color.Blue,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue)
            .padding(28.dp)
    ) {
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
                NormalTextComponent(value = "Hey, there")
                HeadingTextComponent(value = "Bienvenido de Vuelta!")
            }
            Spacer(modifier = Modifier.height(25.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                MyTextFieldComponent(labelValue = "Email", icon = Icons.Outlined.Email)
                Spacer(modifier = Modifier.height(10.dp))
                PasswordTextFieldComponent(labelValue = "Password", icon = Icons.Outlined.Lock)
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    onClick = { /* Acción de inicio de sesión */ },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Login")
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            BottomComponent(
                textQuery = "Eres nuevo",
                textClickable = "Registrate",
                action = "Login",
                navController = navController
            )
        }
    }
}

@Composable
fun NormalTextComponent(value: String) {
    Text(
        text = value,
        fontSize = 18.sp,
        color = Color.Gray,
        textAlign = TextAlign.Center
    )
}

@Composable
fun HeadingTextComponent(value: String) {
    Text(
        text = value,
        fontSize = 24.sp,
        color = Color.White,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center

    )
}

@Composable
fun MyTextFieldComponent(labelValue: String, icon: ImageVector) {
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
fun PasswordTextFieldComponent(labelValue: String, icon: ImageVector) {
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
fun BottomComponent(
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
                navController.navigate("register")
            }
        )
    }
}