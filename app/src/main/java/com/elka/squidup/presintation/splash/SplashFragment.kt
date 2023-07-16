package com.elka.squidup.presintation.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.elka.squidup.databinding.SplashFragmentBinding

class SplashFragment: Fragment() {
  private lateinit var binding: SplashFragmentBinding

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    binding = SplashFragmentBinding.inflate(layoutInflater, container,  false)
    return binding.root
  }
}