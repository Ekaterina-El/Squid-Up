package com.elka.squidup.data

import android.text.TextUtils
import android.util.Patterns
import com.elka.squidup.domain.validator.Validator
import com.elka.squidup.other.AppError

class ValidatorImpl: Validator {
  override fun validatePassword(password: String): AppError? {
    if (password.length < 8) return AppError.SeekPassword
    return null
  }

  override fun validateEmail(email: String): AppError? {
    if ((!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches())) return null
    return AppError.InvalidEmail
  }

  override fun validateLogin(login: String): AppError? {
    return null
  }
}