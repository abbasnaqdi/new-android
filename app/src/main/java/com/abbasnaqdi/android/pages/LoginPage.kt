package com.abbasnaqdi.android.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.Call
import androidx.compose.material.icons.twotone.Email
import androidx.compose.material.icons.twotone.LocationOn
import androidx.compose.material.icons.twotone.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abbasnaqdi.android.R

@Preview(showBackground = true)
@Composable
private fun LoginPreview() {
    LoginPage()
}

@Composable
fun LoginPage() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = 0.8f))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp)
                .align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Login Logo",
                modifier = Modifier.size(120.dp)
            )

            Text(
                text = "Welcome Back",
                style = MaterialTheme.typography.headlineSmall,
                color = Color.White,
                modifier = Modifier.padding(top = 24.dp)
            )

            Text(
                text = "Login to your account",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.White,
                modifier = Modifier.padding(top = 8.dp)
            )

            OutlinedTextField(
                leadingIcon = {
                    Icon(
                        tint = Color.Gray,
                        imageVector = Icons.TwoTone.Email,
                        contentDescription = ""
                    )
                },
                value = "",
                onValueChange = {},
                label = {
                    Text(
                        "Email",
                        color = Color.White
                    )
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp),
            )

            OutlinedTextField(
                leadingIcon = {
                    Icon(
                        tint = Color.Gray,
                        imageVector = Icons.TwoTone.Lock,
                        contentDescription = ""
                    )
                },
                value = "",
                onValueChange = {},
                label = {
                    Text(
                        "Password",
                        color = Color.White
                    )
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                visualTransformation = PasswordVisualTransformation(),
            )

            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp),
                colors = ButtonDefaults.buttonColors()
            ) {
                Text(
                    text = "Login",
                    color = Color.White
                )
            }

            Row(
                modifier = Modifier.padding(top = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Don't have an account?",
                    color = Color.White
                )

                TextButton(onClick = {}) {
                    Text(
                        text = "Sign up",
                    )
                }
            }

            // Additional elements added to match the image

            Row(
                modifier = Modifier.padding(top = 32.dp)
            ) {
                HorizontalDivider(
                    modifier = Modifier
                        .height(1.dp)
                        .weight(1f),
                    color = Color.White
                )
                Text(
                    text = "or continue with",
                    color = Color.White,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                HorizontalDivider(
                    modifier = Modifier
                        .height(1.dp)
                        .weight(1f),
                    color = Color.White
                )
            }

            Row(
                modifier = Modifier.padding(top = 32.dp)
            ) {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.TwoTone.Call,
                        contentDescription = "Call",
                        tint = Color(0xFF4267B2)
                    )
                }
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.TwoTone.Email,
                        contentDescription = "Email",
                        tint = Color(0xFF1DA1F2)
                    )
                }
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.TwoTone.LocationOn,
                        contentDescription = "Location",
                        tint = Color(0xFFDB4437)
                    )
                }
            }
        }
    }
}