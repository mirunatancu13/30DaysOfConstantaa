package com.example.a30daysapp2.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Place (
    @StringRes val dayNumberRes: Int,
    @StringRes val  titleRes: Int,
    @StringRes val descRes: Int,
    @DrawableRes val imageRes: Int,
    val type: PlaceType
)