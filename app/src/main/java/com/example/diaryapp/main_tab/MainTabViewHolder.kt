package com.example.diaryapp.main_tab

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.diaryapp.databinding.MainItemHeader1Binding
import com.example.diaryapp.databinding.MainTab1ItemBinding

sealed class MainTabViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    abstract fun bind(item: MainViewItem)

    class MainTab1HeaderViewHolder(itemView: View) : MainTabViewHolder(itemView) {

        val binding by lazy {
            MainItemHeader1Binding.bind(itemView)
        }
        override fun bind(_item: MainViewItem) {
            val item = (_item as MainViewItem.Header1).mainItem

            binding.apply {
                if (!item.instDtm.isNullOrBlank()) {
                    listHeaderDate = item.instDtm
                } else {
                    listHeaderDate = "앗 null이넹"
                }
            }
        }
    }

    class MainTab1ItemViewHolder(itemView: View) : MainTabViewHolder(itemView) {
        val binding by lazy {
            MainTab1ItemBinding.bind(itemView)
        }

        override fun bind(_item: MainViewItem) {
            val item = (_item as MainViewItem.Item1).mainItem

            binding.apply {
                tvName.text = item.name?:""
                tvAge.text = (item.age?:-1).toString()
            }
        }
    }
}