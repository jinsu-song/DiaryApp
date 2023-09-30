package com.example.diaryapp.main_tab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.diaryapp.BaseFragment
import com.example.diaryapp.databinding.MainTab3FragmentBinding
import javax.inject.Inject

class MainTab3Fragment @Inject constructor() : BaseFragment() {
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