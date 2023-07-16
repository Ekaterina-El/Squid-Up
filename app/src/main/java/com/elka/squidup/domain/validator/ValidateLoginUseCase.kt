package com.elka.squidup.domain.validator

import com.elka.squidup.other.AppError
import javax.inject.Inject

class ValidateLoginUseCase @Inject constructor(private val repo: Validator) {
  operator fun invoke(login: String): AppError? {
    return repo.validateLogin(login)
  }
}