package com.elka.squidup.other

sealed class State() {
  object Enter: State()
  class Error(val errors: List<AppError>): State()
}