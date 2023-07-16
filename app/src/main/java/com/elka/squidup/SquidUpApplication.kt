package com.elka.squidup

import android.app.Application
import com.elka.squidup.di.DaggerAppComponent

class SquidUpApplication: Application() {
  val component by lazy {
    DaggerAppComponent.factory().create(this)
  }
}