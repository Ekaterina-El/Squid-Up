package com.elka.squidup.di

import androidx.lifecycle.ViewModel
import com.elka.squidup.presintation.auth.AuthViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModel {
  @Binds
  @IntoMap
  @ViewModelKey(value = AuthViewModel::class)
  fun authViewModel(impl: AuthViewModel): ViewModel
}