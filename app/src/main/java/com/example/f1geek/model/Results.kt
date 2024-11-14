package com.example.f1geek.model
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Results (
    val year: String,
    val first: String,
    val second: String,
    val third: String
): Parcelable