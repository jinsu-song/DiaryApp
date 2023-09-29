package com.example.diaryapp.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.diaryapp.MainTab1Fragment

class MainTabPagerAdapter(fragmentActivity: Fragment, _titlesSize: Int) : FragmentStateAdapter(fragmentActivity){

    private var titlesSize : Int = 0
    var fragments: ArrayList<Fragment> = ArrayList()

    init {
        titlesSize = _titlesSize
    }
    override fun getItemCount(): Int {
        return titlesSize
    }

    override fun createFragment(position: Int): Fragment {
        return if (position == 0 ) {
            fragments.get(0)
        } else if (position == 1) {
            fragments.get(1)
        } else {
            fragments.get(2)
        }
    }

    fun addFragment(fragment: Fragment) {
        fragments.add(fragment)
    }
}