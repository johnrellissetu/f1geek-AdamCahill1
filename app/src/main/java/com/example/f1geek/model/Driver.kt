package com.example.f1geek.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Driver(
    val firstName: String,
    val surname: String,
    val abbreviatedName: String,
    val number: Int,
    val image: String,
):Parcelable {
    fun getFullName(): String {
        return "$firstName $surname"
    }
}