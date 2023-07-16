package com.elka.squidup.di

import com.elka.squidup.data.ValidatorImpl
import com.elka.squidup.domain.validator.Validator
import dagger.Binds
import dagger.Module

@Module
interface DataModule {
  @Binds
  fun bindValidator(impl: ValidatorImpl): Validator
}