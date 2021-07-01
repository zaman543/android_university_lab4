package com.codepath.recyclerviewlab.models

import com.google.gson.annotations.SerializedName

class NYTimesArticlesAPIResponse {
    @SerializedName("status")
    val status: String? = null

    @JvmField
    @SerializedName("response")
    val response: ArticlesResponse? = null
}