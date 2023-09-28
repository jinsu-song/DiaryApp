package com.example.diaryapp

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

open class BaseActivity : AppCompatActivity() {

    val fm: FragmentManager = supportFragmentManager
    var ft: FragmentTransaction = supportFragmentManager.beginTransaction()

    fun runFragment(frag: Fragment, nSlide: Int = 2) {
        // 툴팁 숨김

        val tag = frag::class.java.simpleName

        // 동일한 클래스명의(FragTabCommon, FragWebview, FragDetail_Product) 가 여러개 생길때 동작하지 않아 우선 주석 처리 함
        val fragment = fm.findFragmentByTag(tag)
        if (fragment == null) {
            when (nSlide) {
                0 -> null
                1 -> ft.setCustomAnimations(R.anim.slide_in, R.anim.fade_out)
                2 -> ft.setCustomAnimations(
                    R.anim.slide_in,
                    R.anim.fade_out,
                    R.anim.fade_in,
                    R.anim.slide_out
                )
                3->ft.setCustomAnimations(R.anim.bottom_in, R.anim.fade_out)
                4->ft.setCustomAnimations(R.anim.bottom_in, R.anim.fade_out,R.anim.fade_in, R.anim.bottom_out)
                5 -> ft.setCustomAnimations(
                    R.anim.slide_in_from_left,
                    R.anim.fade_out,
                    R.anim.fade_in,
                    R.anim.slide_out_to_right
                )
            }
            ft.add(R.id.container, frag)
            ft.addToBackStack(tag)
            ft.commit()

        } else {
            ft.show(fragment)
        }
    }

}