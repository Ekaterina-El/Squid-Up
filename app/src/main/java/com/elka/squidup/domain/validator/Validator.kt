package com.elka.squidup.domain.validator

import com.elka.squidup.other.AppError

interface Validator {
  fun validatePassword(password: String): AppError?
  fun validateEmail(email: String): AppError?
  fun validateLogin(login: String): AppError?
}