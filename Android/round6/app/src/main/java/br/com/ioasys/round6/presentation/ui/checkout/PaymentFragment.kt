package br.com.ioasys.round6.presentation.ui.checkout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import br.com.ioasys.round6.R
import br.com.ioasys.round6.databinding.FragmentPaymentBinding
import br.com.ioasys.round6.presentation.components.SummaryDialog

class PaymentFragment : Fragment() {
    private var _binding: FragmentPaymentBinding? = null
    private val binding: FragmentPaymentBinding get() = _binding!!

    private lateinit var dialog: android.app.AlertDialog

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentPaymentBinding.inflate(inflater, container, false).apply {
        _binding = this
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setDropDown()
        setListeners()
    }

    private fun setListeners() {
        binding.finalizePurchaseButton.setOnClickListener {
            val dialog = SummaryDialog()
            dialog.show(childFragmentManager, dialog.tag)
        }
    }

    private fun setDropDown() {
        val items = resources.getStringArray(R.array.dropdownItens)
        val arrayAdapter = ArrayAdapter(requireContext(), R.layout.dropdown_item, items)

        binding.autoCompleteTextView.setAdapter(arrayAdapter)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}