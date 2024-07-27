package com.example.kidscare.activities

import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import com.example.kidscare.R
import com.example.kidscare.databinding.ActivityPaymentMethodBinding

class PaymentMethodActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPaymentMethodBinding
    private lateinit var selectedRadioButton: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaymentMethodBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Back Button
        binding.backButton.setOnClickListener {
            finish()
        }

        // Toggle Bank Transfer visibility
        binding.btnExpandBankTransfer.setOnClickListener {
            if (binding.llBankTransfer.visibility == View.GONE) {
                binding.llBankTransfer.visibility = View.VISIBLE
                binding.btnExpandBankTransfer.setImageResource(R.drawable.ic_expand_less)
            } else {
                binding.llBankTransfer.visibility = View.GONE
                binding.btnExpandBankTransfer.setImageResource(R.drawable.ic_expand_more)
            }
        }

        // Toggle Other visibility
        binding.btnExpandOther.setOnClickListener {
            if (binding.llOther.visibility == View.GONE) {
                binding.llOther.visibility = View.VISIBLE
                binding.btnExpandOther.setImageResource(R.drawable.ic_expand_less)
            } else {
                binding.llOther.visibility = View.GONE
                binding.btnExpandOther.setImageResource(R.drawable.ic_expand_more)
            }
        }

        // RadioButtons onClickListeners
        binding.rbAlfamart.setOnClickListener { onRadioButtonClicked(binding.rbAlfamart) }
        binding.rbIndomaret.setOnClickListener { onRadioButtonClicked(binding.rbIndomaret) }
        binding.rbBca.setOnClickListener { onRadioButtonClicked(binding.rbBca) }
        binding.rbBri.setOnClickListener { onRadioButtonClicked(binding.rbBri) }
        binding.rbBni.setOnClickListener { onRadioButtonClicked(binding.rbBni) }
        binding.rbDana.setOnClickListener { onRadioButtonClicked(binding.rbDana) }
    }

    private fun onRadioButtonClicked(radioButton: RadioButton) {
        if (this::selectedRadioButton.isInitialized && selectedRadioButton != radioButton) {
            selectedRadioButton.isChecked = false
        }
        radioButton.isChecked = true
        selectedRadioButton = radioButton
    }
}
