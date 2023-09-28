package com.example.diaryapp.my_todo

import android.os.Bundle
import com.example.diaryapp.BaseActivity
import com.example.diaryapp.databinding.ActivityMyTodoBinding

class MyTodoActivity : BaseActivity() {

    lateinit var binding: ActivityMyTodoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMyTodoBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}