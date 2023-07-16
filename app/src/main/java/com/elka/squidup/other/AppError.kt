package com.elka.squidup.other

sealed class AppError {
  object SeekPassword: AppError()
  object InvalidEmail: AppError()
  object InvalidAuth: AppError()
  object CollisionLogin: AppError()
}