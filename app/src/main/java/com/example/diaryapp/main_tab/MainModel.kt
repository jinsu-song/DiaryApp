package com.example.diaryapp.main_tab

open class MainModel {
    constructor()
    class TempClass(instDtm: String?, list: ArrayList<TempClass2>?) : MainModel() {
        var instDtm: String? = instDtm
        var list: ArrayList<TempClass2>? = list
    }

    class TempClass2(name: String?, age: Int?) : MainModel() {
        var name: String? = name
        var age: Int? = age
    }
}