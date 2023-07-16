package com.elka.squidup.presintation.auth

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.elka.squidup.databinding.AuthFragmentBinding
import com.elka.squidup.other.AppError
import com.elka.squidup.other.State

class AuthFragment : Fragment() {
  private lateinit var binding: AuthFragmentBinding
  private val viewModel: AuthViewModel by lazy {
    ViewModelProvider(this@AuthFragment)[AuthViewModel::class.java]
  }

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
  ): View {
    binding = AuthFragmentBinding.inflate(layoutInflater, container, false)
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    viewModel.state.observe(this) {
      when(it) {
        is State.Error -> showErrors(it.errors)
        else -> Unit
      }
    }

    viewModel.auth()
  }

  private fun showErrors(errors: List<AppError>) {
    Log.d("ShowErrors", errors.joinToString())
  }
}
