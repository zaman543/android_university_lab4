package com.codepath.recyclerviewlab.models

import com.google.gson.annotations.SerializedName

class ArticlesResponse {
    @JvmField
    @SerializedName("docs")
    val docs: List<Article>? = null
}