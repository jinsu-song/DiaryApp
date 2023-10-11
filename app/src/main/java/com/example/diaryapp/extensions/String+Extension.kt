package com.example.diaryapp.extensions

import java.text.DecimalFormat

fun String.moneyFormat(money: Long) : String {
    val dec = DecimalFormat("#,###")

    return try {
        dec.format(money)
    } catch (e: Exception) {
        e.printStackTrace()
        "Not Valid Number"
    }
}