package com.codepath.recyclerviewlab.models;

import com.google.gson.annotations.SerializedName;

public class NYTimesBooksAPIResponse {

    @SerializedName("status")
    public String status;

    @SerializedName("results")
    public BestSellerResults results;
}
