package com.elka.squidup.presintation.auth

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.elka.squidup.data.ValidatorImpl
import com.elka.squidup.domain.validator.ValidateEmailUseCase
import com.elka.squidup.domain.validator.ValidatePasswordUseCase
import com.elka.squidup.other.AppError
import com.elka.squidup.other.State

class AuthViewModel : ViewModel() {
  val email = MutableLiveData("")
  val password = MutableLiveData("")

  private val repo = ValidatorImpl()
  private val validateEmailUseCase = ValidateEmailUseCase(repo)
  private val validatePasswordUseCase = ValidatePasswordUseCase(repo)

  private val _state = MutableLiveData<State>(State.Enter)
  val state: LiveData<State> = _state

  fun auth() {
    val errors = validate()
    if (errors.isNotEmpty()) {
      _state.value = State.Error(errors)
      return
    }

    // TODO: auth to db

    email.value = ""
    password.value = ""
  }

  private fun validate(): List<AppError> {
    val errors = mutableListOf<AppError>()
    validateEmailUseCase(email.value!!)?.let { errors.add(it) }
    validatePasswordUseCase(password.value!!)?.let { errors.add(it) }
    return errors
  }
}