package com.example.f1geek.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Team(
    val name: String,
    val primaryDriver: Driver,
    val secondaryDriver: Driver,
    val reserveDrivers: List<Driver>
): Parcelable {
    init {
        if(primaryDriver.number == secondaryDriver.number) {
            throw IllegalStateException("primary driver and secondary driver are the same")
        }
    }
}