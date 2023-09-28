package com.example.diaryapp

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.RequiresApi
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.lifecycle.lifecycleScope
import com.example.diaryapp.databinding.MainFragmentBinding
import kotlinx.coroutines.launch
import java.time.*
import java.util.*
import java.util.concurrent.TimeUnit
import java.util.jar.Manifest

class MainFragment : BaseFragment() {
    private lateinit var binding: MainFragmentBinding


    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MainFragmentBinding.inflate(inflater, container, false)

        init()

        return binding.root
    }

    private fun init() {
        println("안녕하세요")
    }

}