package com.elka.squidup.domain.validator

import com.elka.squidup.other.AppError

class ValidateLoginUseCase(private val repo: Validator) {
  operator fun invoke(login: String): AppError? {
    return repo.validateLogin(login)
  }
}