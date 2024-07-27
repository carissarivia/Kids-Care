package com.example.kidscare.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kidscare.activities.LandingActivity
import com.example.kidscare.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment() {

    private var _binding: FragmentSignUpBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSignUpBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvSignInPrompt.setOnClickListener {
            // Kembali ke halaman SignInFragment
            (activity as? LandingActivity)?.navigateToSignIn()
        }

        binding.btnSignUp.setOnClickListener {
            // Implementasikan logika pendaftaran di sini
            // Setelah pendaftaran berhasil, kembali ke halaman sign in
            (activity as? LandingActivity)?.navigateToSignIn()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
