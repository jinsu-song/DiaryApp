package com.example.diaryapp.main_tab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.diaryapp.BaseFragment
import com.example.diaryapp.databinding.MainTab2FragmentBinding

class MainTab2Fragment : BaseFragment() {

    private lateinit var binding: MainTab2FragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MainTab2FragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
}