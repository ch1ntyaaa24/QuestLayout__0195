package com.example.tugas3_composablelayout2.model

import androidx.annotation.ColorRes
import androidx.annotation.FontRes
import androidx.annotation.StringRes

data class Mahasiswa(
    @StringRes val name: Int,
    @StringRes val phone: Int? = null,
    @StringRes val address: Int,
    @ColorRes val cardColor: Int,
    @ColorRes val nameColor: Int,
    @ColorRes val phoneColor: Int,
    @ColorRes val addressColor: Int,
    @FontRes val nameFont: Int? = null
)