package com.elka.squidup.domain.validator

import com.elka.squidup.other.AppError

class ValidatePasswordUseCase(private val repo: Validator) {
  operator fun invoke(password: String): AppError? {
    return repo.validatePassword(password)
  }
}