package com.travel.tripit.presentation.ui.auth

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor() : ViewModel() {

    var email by mutableStateOf("")
        private set

    var registerEmail by mutableStateOf("")
        private set

    var registerPassword by mutableStateOf("")
        private set

    fun updateRegisterEmail(email: String) {
        this.registerEmail = email
    }

    fun updateRegisterPassword(password: String) {
        this.registerPassword = password
    }

    fun updateEmail(email: String) {
        this.email = email
    }

    var password by mutableStateOf("")
        private set

    fun updatePassword(password: String) {
        this.password = password
    }

}