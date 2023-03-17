package com.example.pets

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Animals(
    val name: String,
    val discription: String,
    val image: Int): Parcelable
