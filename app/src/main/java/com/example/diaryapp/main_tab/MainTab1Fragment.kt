package com.example.diaryapp.main_tab

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.diaryapp.BaseFragment
import com.example.diaryapp.databinding.MainTab1FragmentBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainTab1Fragment @Inject constructor(): BaseFragment() {
    private lateinit var binding : MainTab1FragmentBinding

    @Inject lateinit var mAdapter : MainTabAdapter
    private var mMainTab1Data = ArrayList<MainModel.TempClass>()

    private val vm : MainTabViewModel by viewModels()

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
        binding.recyclerview.adapter = mAdapter
        binding.recyclerview.layoutManager = LinearLayoutManager(requireActivity())
        observeData()
        vm.getUserInsertInfo()
    }

    private fun ArrayList<MainModel.TempClass>.toViewList(): ArrayList<MainViewItem> {
        val result = arrayListOf<MainViewItem>()

        this.forEach{ item ->
            result.add(MainViewItem.Header1(item))
            item.list?.forEach {innerItem ->
                result.add(MainViewItem.Item1(innerItem))
            }
        }
        mAdapter.listCount = result.size
        return result
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun observeData() {
        vm.liveData.observe(requireActivity()) {
            mMainTab1Data = it
            mAdapter.setList(mMainTab1Data.toViewList())
        }
    }
}