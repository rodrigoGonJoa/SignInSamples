package com.rodrigo.signinexamples.sign_in_samples

import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rodrigo.signinexamples.R
import com.rodrigo.signinexamples.utils.rememberImeState

@Composable
fun SignIn1() {
    val appName = "AppName"
    val highlightColor = Color(red = 224, green = 96, blue = 63, alpha = 255)
    val buttonHeight = 50.dp
    val shapeSizeValue = 30.dp
    val imeState = rememberImeState()
    val scrollState = rememberScrollState()

    LaunchedEffect(key1 = imeState.value) {
        if (imeState.value) {
            scrollState.animateScrollTo(scrollState.maxValue, tween(300))
        }
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            modifier = Modifier.fillMaxSize(), painter = painterResource(R.drawable.background),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            alpha = 1f
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .alpha(0.7f)
                .background(
                    if (isSystemInDarkTheme()) Color.Black else Color.White
                )
        )
        Column(
            modifier = Modifier
                .padding(32.dp)
                .fillMaxSize()
                .verticalScroll(state = scrollState),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.weight(0.5f))
            HeadLineText(appName)
            Spacer(modifier = Modifier.size(16.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.Start),
                verticalAlignment = Alignment.CenterVertically
            ) {
                BasicText(textValue = "New to $appName? ")
                ClickableTextSample(
                    textValue = "Sign Up",
                    colorValue = highlightColor,
                    onTextClick = {/*TODO*/ })
                BasicText(textValue = " now")
            }
            Spacer(modifier = Modifier.size(16.dp))
            OutsideSignInButton(
                textValue = "Apple",
                iconPath = R.drawable.apple_icon,
                onButtonClicked = {/*TODO*/ },
                backgroundColor = Color.White,
                buttonHeight = buttonHeight,
                shapeSize = shapeSizeValue
            )
            Spacer(modifier = Modifier.size(16.dp))
            OutsideSignInButton(
                textValue = "Google",
                iconPath = R.drawable.google_icon,
                onButtonClicked = {/*TODO*/ },
                backgroundColor = Color.Black,
                buttonHeight = buttonHeight,
                shapeSize = shapeSizeValue
            )
            Spacer(modifier = Modifier.size(16.dp))
            SignDivider()
            Spacer(modifier = Modifier.size(8.dp))
            InputDataComposable(
                textValue = "Email",
                placeholder = "Enter your email",
                KeyboardType.Email
            )
            Spacer(modifier = Modifier.size(8.dp))
            InputDataComposable(
                textValue = "Password",
                placeholder = "Enter your password",
                KeyboardType.Password
            )
            Spacer(modifier = Modifier.size(16.dp))
            Box(
                modifier = Modifier
                    .wrapContentHeight()
                    .fillMaxWidth(),
                contentAlignment = Alignment.CenterEnd
            ) {
                ClickableTextSample(
                    textValue = "Forgot Password?",
                    colorValue = highlightColor,
                    onTextClick = {/*TODO*/ })
            }
            Spacer(modifier = Modifier.size(16.dp))
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(buttonHeight),
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = highlightColor)
            ) { Text(text = "Sign in",color = MaterialTheme.colorScheme.onSurface) }
            Spacer(modifier = Modifier.weight(1f))
            if (!imeState.value) {
                RRSSButtons(shapeSizeValue)
            }
        }
    }

}

@Composable
fun RRSSButtons(shapeSize: Dp) {
    Row {
        RoundBottom(
            size = 50,
            imageIconPath = R.drawable.instagram_icon,
            onButtonClick = { /*TODO*/ },
            shapeSize = shapeSize
        )
        Spacer(modifier = Modifier.size(8.dp))
        RoundBottom(
            size = 50,
            imageIconPath = R.drawable.facebook_icon,
            onButtonClick = { /*TODO*/ },
            shapeSize = shapeSize
        )
        Spacer(modifier = Modifier.size(8.dp))
        RoundBottom(
            size = 50,
            imageIconPath = R.drawable.youtube_icon,
            onButtonClick = { /*TODO*/ },
            shapeSize = shapeSize
        )
        Spacer(modifier = Modifier.size(8.dp))
        RoundBottom(
            size = 50,
            imageIconPath = R.drawable.twitterx_icon,
            onButtonClick = { /*TODO*/ },
            shapeSize = shapeSize
        )
        Spacer(modifier = Modifier.size(8.dp))
        RoundBottom(
            size = 50,
            imageIconPath = R.drawable.spotify_icon,
            onButtonClick = { /*TODO*/ },
            shapeSize = shapeSize
        )
    }
}

@Composable
fun RoundBottom(size: Int, imageIconPath: Int, onButtonClick: () -> Unit, shapeSize: Dp) {
    Box(contentAlignment = Alignment.Center) {
        Button(
            modifier = Modifier
                .size(size.dp)
                .border(
                    width = 0.5.dp,
                    color = Color.Black,
                    shape = RoundedCornerShape(shapeSize)
                ),
            shape = RoundedCornerShape(size.dp),
            onClick = onButtonClick,
            colors = ButtonDefaults.buttonColors(
                containerColor =
                if (isSystemInDarkTheme()) Color.Black else Color.White
            )
        ) {}
        Image(
            modifier = Modifier.size(size.dp / 2),
            painter = painterResource(imageIconPath),
            contentDescription = ""
        )
    }
}

@Composable
fun InputDataComposable(textValue: String, placeholder: String, keyboardType: KeyboardType) {
    var value by remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = textValue,
            fontWeight = FontWeight.Medium,
            color = MaterialTheme.colorScheme.onSurface
        )
        Spacer(modifier = Modifier.size(8.dp))
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = value,
            onValueChange = { value = it },
            shape = RoundedCornerShape(30.dp),
            placeholder = { Text(placeholder) },
            keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
            singleLine = true
        )
    }
}

@Composable
fun SignDivider() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        HorizontalDivider(modifier = Modifier.weight(1f), thickness = 1.dp, color = MaterialTheme.colorScheme.onSurface)
        Spacer(modifier = Modifier.size(8.dp))
        Text(text = "Or",color = MaterialTheme.colorScheme.onSurface)
        Spacer(modifier = Modifier.size(8.dp))
        HorizontalDivider(modifier = Modifier.weight(1f), thickness = 1.dp, color = MaterialTheme.colorScheme.onSurface)
    }
}

@Composable
fun OutsideSignInButton(
    textValue: String,
    iconPath: Int,
    onButtonClicked: () -> Unit,
    backgroundColor: Color,
    buttonHeight: Dp,
    shapeSize: Dp
) {
    Button(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = Color.Black,
                shape = RoundedCornerShape(shapeSize)
            )
            .height(buttonHeight),
        onClick = onButtonClicked,
        colors = ButtonDefaults.buttonColors(containerColor = backgroundColor),
        shape = RoundedCornerShape(shapeSize)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.scale(0.9f),
                painter = painterResource(iconPath),
                contentDescription = "",
                )
            Spacer(Modifier.size(8.dp))
            Text(
                text = "Sign in with $textValue",
                color = if (backgroundColor == Color.White) Color.Black else Color.White
            )
        }
    }
}

@Composable
fun HeadLineText(appName: String) {
    Text(
        modifier = Modifier.fillMaxWidth(),
        text = "Sign to $appName",
        fontWeight = FontWeight.W900,
        fontSize = 30.sp,
        color = MaterialTheme.colorScheme.onSurface
    )
}

@Composable
fun BasicText(textValue: String) {
    Text(text = textValue,
        color = MaterialTheme.colorScheme.onSurface)
}

@Composable
fun ClickableTextSample(textValue: String, colorValue: Color, onTextClick: (Int) -> Unit) {
    ClickableText(
        text = AnnotatedString(textValue),
        onClick = onTextClick,
        style = TextStyle(
            color = colorValue,
            fontWeight = FontWeight.Medium
        )
    )
}

@Composable
@Preview(showSystemUi = true)
fun SignIn1Preview() {
    SignIn1()
}
