package com.example.diaryapp.main_tab

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.diaryapp.databinding.MainItemHeader1Binding

class MainTabAdapter : RecyclerView.Adapter<MainTabViewHolder>() {
    private val list = arrayListOf<MainViewItem>()

    var listCount: Int = 0

    fun setList(items: ArrayList<MainViewItem>) {
        list.clear()
        list.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainTabViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return when(viewType) {
            MainViewItem.Header1.VIEW_TYPE -> MainTabViewHolder.MainTab1HeaderViewHolder(itemView)
            MainViewItem.Item1.VIEW_TYPE -> MainTabViewHolder.MainTab1ItemViewHolder(itemView)
            else -> throw IllegalArgumentException("Cannot create ViewHolder for view type: ${viewType}")
        }
    }

    override fun onBindViewHolder(holder: MainTabViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    override fun getItemCount(): Int {
        return listCount
    }

    private fun getItem(position: Int) : MainViewItem {
        return this.list[position]
    }

    override fun getItemViewType(position: Int): Int {
        return getItem(position).layoutId
    }
}