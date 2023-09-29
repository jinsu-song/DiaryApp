package com.example.diaryapp.main_tab

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainTabViewModel @Inject constructor(): ViewModel() {

    val liveData = MutableLiveData<ArrayList<MainModel.TempClass>>()

    fun getUserInsertInfo() {
        val arrayList = ArrayList<MainModel.TempClass>()
        val arr = ArrayList<MainModel.TempClass2>()

        arr.add(MainModel.TempClass2("songjinsu", 29))
        arr.add(MainModel.TempClass2("jinsu",  29))
        arr.add(MainModel.TempClass2("jinjin", 29))

        arrayList.add(MainModel.TempClass("2023-09-29", arr))

        liveData.postValue(arrayList)
    }


}