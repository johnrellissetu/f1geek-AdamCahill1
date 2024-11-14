package com.example.f1geek.model
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Circuit(
    val name: String,
    val country: String,
    val length: Double,
    val results: List<Results>
): Parcelable