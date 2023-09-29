package com.example.diaryapp

import android.os.Bundle
import android.widget.Toast
import com.example.diaryapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {

    private var backKeyPressedTime : Long = 0L

    private lateinit var binding: ActivityMainBinding
    private val mainFragment = MainFragment()
    private val menuFragment = MenuFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        clickEvent()
        init()
    }

    fun init() {
        ft = supportFragmentManager.beginTransaction()
        runFragment(mainFragment)
    }

    fun clickEvent() {
        binding.btnMenu.setOnClickListener {
            ft = supportFragmentManager.beginTransaction()
            runFragment(menuFragment, 5)
        }
    }

    override fun onBackPressed() {

        val fragmentBackStackCount = fm.fragments.size

        if (fragmentBackStackCount == 1) {   // main fragment는 남아 있음으로

            if (System.currentTimeMillis() > backKeyPressedTime + 2500) {
                backKeyPressedTime = System.currentTimeMillis()
                Toast.makeText(this, "정말 앱종료??", Toast.LENGTH_SHORT).show()
                return
            }

            if (System.currentTimeMillis() <= backKeyPressedTime + 2500) {
                finishAffinity()
            }

        } else {
            fm.popBackStack()
        }
    }
}