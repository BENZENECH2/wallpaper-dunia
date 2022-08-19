package com.aryanbaisoya.wallpaperdunia;

import static com.aryanbaisoya.wallpaperdunia.ApiUyilities.API;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public class ApiInterface {

    public static String BASE_URL;
    String  base_url ="https://api.pexels.com/v1/";

    @Header("Authorization:563492ad6f917000010000010847d3eb96484a188c9d7d941bd4e9e3")
    @GET("curated")
    protected Call<SearchModel> getImage(

            @Query("page") int page,
            @Query("per_page") int per_page

    );


    @Header("Authorization:563492ad6f917000010000010847d3eb96484a188c9d7d941bd4e9e3")
    @GET("search")
    Call<SearchModel> getSearchImage(

            @Query("query") String query,
            @Query("page") int page,
            @Query("per_page") int per_page

    );


}
