package com.example.cp2mobile

import android.os.Bundle
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar

class FormFragment : Fragment() {

    private lateinit var nameInput: EditText
    private lateinit var emailInput: EditText
    private lateinit var spinner: Spinner
    private lateinit var sendButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_form, container, false)


        nameInput = view.findViewById(R.id.editTextName)
        emailInput = view.findViewById(R.id.editTextEmail)
        spinner = view.findViewById(R.id.spinnerOptions)
        sendButton = view.findViewById(R.id.buttonSend)

        val options = resources.getStringArray(R.array.event_categories)
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, options)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        sendButton.setOnClickListener {
            val name = nameInput.text.toString().trim()
            val email = emailInput.text.toString().trim()
            val option = spinner.selectedItem.toString()

            if (name.isEmpty()) {
                Snackbar.make(view, "Por favor, insira seu nome.", Snackbar.LENGTH_LONG).show()
            } else if (email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                Snackbar.make(view, "Por favor, insira um email válido.", Snackbar.LENGTH_LONG).show()
            } else if (option.isEmpty() || option == "Selecione uma opção") {
                Snackbar.make(view, "Por favor, selecione uma categoria.", Snackbar.LENGTH_LONG).show()
            } else {

                val bundle = Bundle().apply {
                    putString("name", name)
                    putString("email", email)
                    putString("option", option)
                }

                findNavController().navigate(R.id.action_formFragment_to_resultFragment, bundle)


                clearForm()
            }
        }

        return view
    }


    private fun clearForm() {
        nameInput.text.clear()
        emailInput.text.clear()
        spinner.setSelection(0)
    }
}
