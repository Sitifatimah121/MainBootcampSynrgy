package com.example.intentapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Person (
    val nama: String?,
    val umur: Int?,
    val email: String?,
    val domisili: String?,
    val statusMenikah: Boolean?
    ) : Parcelable {
}