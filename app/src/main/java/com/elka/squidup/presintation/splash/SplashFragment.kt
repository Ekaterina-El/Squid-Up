package com.elka.squidup.presintation.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.elka.squidup.R
import com.elka.squidup.databinding.SplashFragmentBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashFragment : Fragment() {
  private lateinit var binding: SplashFragmentBinding

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
  ): View {
    binding = SplashFragmentBinding.inflate(layoutInflater, container, false)
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    lifecycleScope.launch {
      delay(LOADING_DELAY)
      navigateNextScreen()
    }
  }

  private fun navigateNextScreen() {
    if (isAuthedUser()) navigateToAuthedScreens() else navigateToAuthScreen()
  }

  private fun navigateToAuthScreen() {
    val action = SplashFragmentDirections.actionSplashFragmentToAuthFragment()
    findNavController().navigate(action)
  }

  private fun navigateToAuthedScreens() {
    // TODO: write code
  }

  private fun isAuthedUser(): Boolean {
    return false
  }

  companion object {
    const val LOADING_DELAY = 1000L
  }
}