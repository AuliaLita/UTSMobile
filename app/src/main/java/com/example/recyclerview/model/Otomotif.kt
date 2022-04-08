package com.example.recyclerview.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Otomotif(
    @StringRes val stringResourceId: Int,
    @StringRes val stringResourceId1: Int,
    @DrawableRes val imageResourceId: Int
)