package com.example.diaryapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.diaryapp.databinding.MainTab3FragmentBinding

class MainTab3Fragment : BaseFragment() {
    private lateinit var binding: MainTab3FragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MainTab3FragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
}