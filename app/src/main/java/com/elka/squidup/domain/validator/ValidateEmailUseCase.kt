package com.elka.squidup.domain.validator

import com.elka.squidup.other.AppError

class ValidateEmailUseCase(private val repo: Validator) {
  operator fun invoke(email: String): AppError? {
    return repo.validateEmail(email)
  }
}