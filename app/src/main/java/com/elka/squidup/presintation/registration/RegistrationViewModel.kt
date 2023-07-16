package com.elka.squidup.presintation.registration

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.elka.squidup.domain.validator.ValidateEmailUseCase
import com.elka.squidup.domain.validator.ValidateLoginUseCase
import com.elka.squidup.domain.validator.ValidatePasswordUseCase
import com.elka.squidup.other.AppError
import com.elka.squidup.other.State
import javax.inject.Inject

class RegistrationViewModel @Inject constructor(
  val validateLoginUseCase: ValidateLoginUseCase,
  val validateEmailUseCase: ValidateEmailUseCase,
  val validatePasswordUseCase: ValidatePasswordUseCase
) : ViewModel() {

  val login = MutableLiveData("")
  val email = MutableLiveData("")
  val password = MutableLiveData("")

  private val _state = MutableLiveData<State>(State.Enter)
  val state: LiveData<State> = _state

  fun registration() {
    val errors = validate()
    if (errors.isNotEmpty()) {
      _state.value = State.Error(errors)
      return
    }

    // TODO: registration to db

    clearFields()
  }

  private fun clearFields() {
    login.value = ""
    email.value = ""
    password.value = ""
  }

  private fun validate(): List<AppError> {
    val errors = mutableListOf<AppError>()
    validateLoginUseCase(login.value!!)?.let { errors.add(it) }
    validateEmailUseCase(email.value!!)?.let { errors.add(it) }
    validatePasswordUseCase(password.value!!)?.let { errors.add(it) }
    return errors
  }
}