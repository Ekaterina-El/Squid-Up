package com.elka.squidup.di

import com.elka.squidup.presintation.auth.AuthFragment
import dagger.Component
import dagger.Subcomponent

@Subcomponent(modules = [ViewModelModel::class])
interface AuthComponent {
  fun inject(authFragment: AuthFragment)

  @Subcomponent.Factory
  interface Factory {
    fun create(): AuthComponent
  }
}