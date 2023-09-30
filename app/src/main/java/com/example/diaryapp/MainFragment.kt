package com.example.diaryapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.diaryapp.main_tab.MainTabPagerAdapter
import com.example.diaryapp.databinding.MainFragmentBinding
import com.example.diaryapp.main_tab.MainTab1Fragment
import com.example.diaryapp.main_tab.MainTab2Fragment
import com.example.diaryapp.main_tab.MainTab3Fragment
import com.google.android.material.tabs.TabLayoutMediator
import javax.inject.Inject

class MainFragment @Inject constructor(): BaseFragment() {
    private lateinit var binding: MainFragmentBinding

    @Inject lateinit var tab1Fragment: MainTab1Fragment
    @Inject lateinit var tab2Fragment: MainTab2Fragment
    @Inject lateinit var tab3Fragment: MainTab3Fragment

    private val TAB_TITLE = arrayOf(
        "탭1",
        "탭2",
        "탭3"
    )

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

        val sectionPagerAdapter : MainTabPagerAdapter = MainTabPagerAdapter(this, TAB_TITLE.size )
        sectionPagerAdapter.addFragment(tab1Fragment)
        sectionPagerAdapter.addFragment(tab2Fragment)
        sectionPagerAdapter.addFragment(tab3Fragment)

        binding.viewPager.adapter = sectionPagerAdapter

        binding.viewPager.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
            }
        })

        TabLayoutMediator(binding.tabs, binding.viewPager) { tab, position ->
            when(position) {
                0 -> {
                    tab.text = "탭1"
                }
                1 -> {
                    tab.text = "탭2"
                }
                2 -> {
                    tab.text = "탭3"
                }
            }

        }.attach()

    }

}