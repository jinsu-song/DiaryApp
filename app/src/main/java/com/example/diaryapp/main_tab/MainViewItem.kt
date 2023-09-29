package com.example.diaryapp.main_tab

import com.example.diaryapp.R

sealed class MainViewItem {
    abstract val mainItem: MainModel
    abstract val layoutId: Int

    data class Header1(
        override val mainItem: MainModel.TempClass,
        override val layoutId: Int = VIEW_TYPE
    ) : MainViewItem() {
        companion object {
            const val VIEW_TYPE = R.layout.main_item_header1
        }
    }

    data class Item1(
        override val mainItem: MainModel.TempClass2,
        override val layoutId: Int = VIEW_TYPE
    ) : MainViewItem() {
        companion object {
            const val VIEW_TYPE = R.layout.main_tab1_item
        }
    }

}