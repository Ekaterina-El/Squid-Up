package com.elka.squidup.presintation.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.elka.squidup.databinding.AuthFragmentBinding

class AuthFragment : Fragment() {
  private lateinit var binding: AuthFragmentBinding

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
  ): View {
    binding = AuthFragmentBinding.inflate(layoutInflater, container, false)
    return binding.root
  }
}
