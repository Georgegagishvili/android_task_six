package com.example.tasksix

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn = view.findViewById<Button>(R.id.submitBtn)
        val editText = view.findViewById<EditText>(R.id.editText)

        btn.setOnClickListener {
            val text = editText.text.toString()
            val action = HomeFragmentDirections.actionHomeFragmentToLibraryFragment(text)
            view.findNavController().navigate(action)
        }
    }
}