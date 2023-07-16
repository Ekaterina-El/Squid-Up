package com.elka.squidup.domain.validator

import com.elka.squidup.other.AppError
import javax.inject.Inject


class ValidateEmailUseCase @Inject constructor(private val repo: Validator) {
  operator fun invoke(email: String): AppError? {
    return repo.validateEmail(email)
  }
}