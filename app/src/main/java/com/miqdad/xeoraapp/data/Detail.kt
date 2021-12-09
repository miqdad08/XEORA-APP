package com.miqdad.xeoraapp.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Detail (
    val titleArtikel: String,
    val descArtikel: String,
    val imageArtikel: Int,
): Parcelable