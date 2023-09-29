package com.example.diaryapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.diaryapp.databinding.MainTab1FragmentBinding

class MainTab1Fragment : BaseFragment() {
    private lateinit var binding : MainTab1FragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MainTab1FragmentBinding.inflate(inflater, container, false)
        init()
        return binding.root
    }

    private fun init() {

    }
}