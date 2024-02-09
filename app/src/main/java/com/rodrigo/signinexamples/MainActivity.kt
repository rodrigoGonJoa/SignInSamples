package com.rodrigo.signinexamples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.rodrigo.signinexamples.sign_in_samples.SignIn1
import com.rodrigo.signinexamples.ui.theme.SignInExamplesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SignInExamplesTheme {
                SignIn1()
            }
        }
    }
}
