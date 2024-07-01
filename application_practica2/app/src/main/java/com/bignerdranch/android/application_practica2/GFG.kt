package com.bignerdranch.android.application_practica2

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

data class GFG(
    @PrimaryKey val courseID: Int,
    @ColumnInfo(name = "courseName") val name: String?,
    @ColumnInfo(name = "courseID") val email: String?,
    @ColumnInfo(name = "coursePrice") val avatar: String?,
)
