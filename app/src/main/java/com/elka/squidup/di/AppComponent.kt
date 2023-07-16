package com.elka.squidup.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component

@Component(modules = [DataModule::class])
interface AppComponent {
  fun authComponentFactory(): AuthComponent.Factory

  @Component.Factory
  interface Factory {
    fun create(
      @BindsInstance application: Application
    ): AppComponent
  }
}