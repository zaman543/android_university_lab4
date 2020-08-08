package com.codepath.recyclerviewlab.networking;

import com.codepath.recyclerviewlab.models.NYTimesArticlesAPIResponse;
import com.codepath.recyclerviewlab.models.NYTimesBooksAPIResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface NYTimesService {

    @GET("svc/books/v3/lists/{date}/{list}.json")
    Call<NYTimesBooksAPIResponse> getBestSellingBooks(@Path("date") String date, @Path("list") String list, @Query("api-key") String apikey);

    @GET("svc/search/v2/articlesearch.json")
    Call<NYTimesArticlesAPIResponse> getArticlesByQuery(@Path("q") String query, @Path("sort") String sortBy, @Query("api-key") String apikey);
}
