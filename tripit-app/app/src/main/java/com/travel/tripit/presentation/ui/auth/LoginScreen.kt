package com.travel.tripit.presentation.ui.auth

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.ImageLoader
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.travel.tripit.R
import com.travel.tripit.presentation.theme.primaryColor
import com.travel.tripit.presentation.theme.secondaryColor
import com.travel.tripit.presentation.theme.white
import com.travel.tripit.presentation.ui.destinations.RegisterScreenDestination

@RootNavGraph(start = true)
@Destination
@Composable
fun LoginScreen(
    viewModel: AuthViewModel = hiltViewModel(),
    navigator: DestinationsNavigator,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 10.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(2f)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Spacer(modifier = Modifier.weight(1f))
                Spacer(modifier = Modifier.padding(top = 20.dp))
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                    Spacer(modifier = Modifier.width(20.dp))
                    Image(
                        painterResource(id = R.drawable.tripit_logo),
                        contentDescription = "Logo",
                        modifier = Modifier
                            .height(150.dp)
                            .width(150.dp)
                    )
                }
                Spacer(modifier = Modifier.padding(top = 20.dp))
                Text(
                    text = "Wellcome!",
                    color = secondaryColor,
                    fontSize = 26.sp,
                    fontWeight = FontWeight.W800
                )
                Spacer(modifier = Modifier.padding(top = 10.dp))
                Text(
                    text = "Signin to continue",
                    color = Color.Gray,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                )
                Spacer(modifier = Modifier.weight(1f))
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(3f)
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                EditTextField(text = viewModel.email, label = "Email") {
                    viewModel.updateEmail(it)
                }
                EditTextField(text = viewModel.password, label = "Password", isPassword = true) {
                    viewModel.updatePassword(it)
                }
                Spacer(modifier = Modifier.padding(top = 10.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(
                        text = "Forgot password?",
                        color = secondaryColor,
                        modifier = Modifier.padding(top = 10.dp, end = 10.dp),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
                Spacer(modifier = Modifier.padding(top = 10.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp)
                ) {
                    Button(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 5.dp),
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = secondaryColor,
                            contentColor = white
                        ),
                        shape = ShapeDefaults.Small
                    ) {
                        Text(text = "Login", fontWeight = FontWeight.SemiBold)
                    }
                }
                Spacer(modifier = Modifier.padding(top = 10.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "OR",
                        color = secondaryColor,
                        modifier = Modifier.padding(top = 10.dp),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W500
                    )
                }
                Spacer(modifier = Modifier.padding(top = 20.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp)
                ) {
                    Button(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 10.dp, vertical = 8.dp),
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = white,
                            contentColor = Color.Gray
                        ),
                        shape = ShapeDefaults.Small,
                        elevation = ButtonDefaults.buttonElevation(defaultElevation = 2.dp)
                    ) {
                        Image(
                            painterResource(id = R.drawable.google),
                            contentDescription = "",
                            modifier = Modifier
                                .height(20.dp)
                                .width(20.dp)
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(text = "Continue with Google", fontWeight = FontWeight.SemiBold)
                    }
                }
                Spacer(modifier = Modifier.weight(1f))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Don't have an account?  ",
                        color = secondaryColor,
                        modifier = Modifier.padding(top = 10.dp),
                        fontSize = 14.sp
                    )
                    Text(text = "Register",
                        color = primaryColor,
                        fontSize = 14.sp,
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .clickable {
                                navigator.navigate(RegisterScreenDestination)
                            })
                }
                Spacer(modifier = Modifier.padding(top = 20.dp))
            }
        }
    }
}

@Composable
fun EditTextField(
    text: String,
    label: String,
    isPassword: Boolean = false,
    onChange: (String) -> Unit
) {
    OutlinedTextField(value = text, onValueChange = {
        onChange(it)
    }, label = {
        Text(text = label)
    }, maxLines = 1, modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 10.dp),
        visualTransformation = if (isPassword) PasswordVisualTransformation() else VisualTransformation.None,
        keyboardOptions = KeyboardOptions(keyboardType = if (isPassword) KeyboardType.Password else KeyboardType.Text),
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = primaryColor
        )
    )

}