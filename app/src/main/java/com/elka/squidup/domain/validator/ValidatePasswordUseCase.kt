package com.elka.squidup.domain.validator

import com.elka.squidup.other.AppError
import javax.inject.Inject

class ValidatePasswordUseCase @Inject constructor(private val repo: Validator) {
  operator fun invoke(password: String): AppError? {
    return repo.validatePassword(password)
  }
}