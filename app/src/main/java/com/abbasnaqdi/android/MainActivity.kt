package com.abbasnaqdi.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.Email
import androidx.compose.material.icons.twotone.Face
import androidx.compose.material.icons.twotone.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.abbasnaqdi.android.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { MyApplication() }

        // Add your code here

    }
}

@Composable
fun MyApplication() {
    MyApplicationTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) {
            with(Modifier.padding(it)) {
                LoginScreen(
                    onLoginClick = { _, _ -> },
                    onSignUpClick = {},
                    onForgotPasswordClick = {}
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(
        onLoginClick = { _, _ -> },
        onSignUpClick = {},
        onForgotPasswordClick = {}
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    onLoginClick: (email: String, password: String) -> Unit,
    onSignUpClick: () -> Unit,
    onForgotPasswordClick: () -> Unit
) {
    val primaryColor = MaterialTheme.colorScheme.primary
    val typography = MaterialTheme.typography

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        // Top App Bar
        TopAppBar(
            title = {
                Image(
                    imageVector = Icons.TwoTone.Face,
                    contentDescription = "App Logo"
                )
            }
        )

        // Logo
        Image(
            imageVector = Icons.TwoTone.Face,
            contentDescription = "App Logo",
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        // Login Form
        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            // Email/Username Text Field
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = { Text(text = "Email or Username") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.TwoTone.Email,
                        contentDescription = "Email Icon"
                    )
                },
                modifier = Modifier.fillMaxWidth()
            )

            // Password Text Field
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = { Text(text = "Password") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.TwoTone.Lock,
                        contentDescription = "Password Icon"
                    )
                },
                modifier = Modifier.fillMaxWidth()
            )

            // Login Button
            Button(
                onClick = { onLoginClick("", "") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
            ) {
                Text(text = "Log In")
            }
        }

        // Sign-Up and Forgot Password Links
        Row(
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Text(
                text = "Sign up",
                color = primaryColor,
                style = typography.bodyMedium,
                modifier = Modifier
                    .clickable(onClick = onSignUpClick)
                    .padding(end = 16.dp)
            )
            Text(
                text = "Forgot Password?",
                color = primaryColor,
                style = typography.bodyMedium,
                modifier = Modifier.clickable(onClick = onForgotPasswordClick)
            )
        }

        // Bottom Image or Decorative Element
        Image(
            imageVector = Icons.TwoTone.Lock,
            contentDescription = "Bottom Image",
            modifier = Modifier.fillMaxWidth()
        )
    }
}