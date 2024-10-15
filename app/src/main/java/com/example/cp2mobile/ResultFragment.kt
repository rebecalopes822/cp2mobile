package com.example.cp2mobile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class ResultFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_result, container, false)

        val nameTextView: TextView = view.findViewById(R.id.textViewName)
        val emailTextView: TextView = view.findViewById(R.id.textViewEmail)
        val categoryTextView: TextView = view.findViewById(R.id.textViewCategory)
        val backButton: Button = view.findViewById(R.id.buttonBack)

        arguments?.let {
            val name = it.getString("name") ?: "Nome não fornecido"
            val email = it.getString("email") ?: "Email não fornecido"
            val option = it.getString("option") ?: "Categoria não fornecida"

            nameTextView.text = name
            emailTextView.text = email
            categoryTextView.text = option
        }

        backButton.setOnClickListener {

            findNavController().navigateUp()
        }

        return view
    }
}
