package com.codepath.recyclerviewlab.models

import com.google.gson.annotations.SerializedName

class Article {
    @SerializedName("id")
    val id: String? = null

    @SerializedName("headline")
    val headline: ArticleHeadline? = null

    @SerializedName("web_url")
    val webUrl: String? = null

    @SerializedName("multimedia")
    val multimedia: List<Multimedia>? = null

    @SerializedName("snippet")
    val snippet: String? = null

    @SerializedName("word_count")
    val wordCount: String? = null

    @SerializedName("print_section")
    val printSection: String? = null

    @SerializedName("section_name")
    val sectionName: String? = null

    @SerializedName("print_page")
    val printPage: String? = null

    @SerializedName("pub_date")
    val publishDate: String? = null
}