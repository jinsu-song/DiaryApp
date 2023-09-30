package com.example.diaryapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.diaryapp.BaseFragment
import com.example.diaryapp.databinding.MenuFragmentBinding
import javax.inject.Inject

class MenuFragment @Inject constructor() : BaseFragment() {

    lateinit var binding: MenuFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MenuFragmentBinding.inflate(inflater, container, false)
        clickEvent()
        return binding.root
    }

    fun clickEvent() {

        binding.closeMenu.setOnClickListener {
            activity?.onBackPressed()
        }

        binding.menu1.menuItem.setOnClickListener {
            Toast.makeText(requireContext(), "우왕 눌렸당", Toast.LENGTH_SHORT).show()
        }

        binding.menu2.menuItem.setOnClickListener {
            Toast.makeText(requireContext(), "우왕 눌렸당", Toast.LENGTH_SHORT).show()
        }

        binding.menu3.menuItem.setOnClickListener {
            Toast.makeText(requireContext(), "우왕 눌렸당", Toast.LENGTH_SHORT).show()
        }
    }

}