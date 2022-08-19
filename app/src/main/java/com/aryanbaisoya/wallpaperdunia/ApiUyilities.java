package com.aryanbaisoya.wallpaperdunia;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUyilities {

    private static Retrofit retrofit=null;
    public static final String API="563492ad6f917000010000010847d3eb96484a188c9d7d941bd4e9e3";


    public static ApiInterface getApiInterface()
    {
     if(retrofit==null)
     {
         retrofit=new Retrofit.Builder().baseUrl(ApiInterface.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
     }
     return retrofit.create(ApiInterface.class);
    }




}
