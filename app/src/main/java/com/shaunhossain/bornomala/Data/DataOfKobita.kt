package com.shaunhossain.bornomala.Data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataOfKobita ( var relatedImage: Int,
                          var kobitaName: String,
                          var kobiName: String,
                          var kobita: String): Parcelable {
}