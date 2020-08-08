package com.codepath.recyclerviewlab.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Article {
    @SerializedName("id")
    String _id;

    @SerializedName("byline")
    String byline;

    @SerializedName("headline")
    String headline;

    @SerializedName("web_url")
    String webUrl;

    @SerializedName("multimedia")
    List<Multimedia> multimedia;

    @SerializedName("snippet")
    String snippet;

    @SerializedName("word_count")
    String wordCount;

    @SerializedName("pub_date")
    String publishDate;
}
