package com.example.mohamed.location.Remote;

import com.example.mohamed.location.Model.MyPlaces;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Mohamed on 9/22/2018.
 */

public interface IGoogleApiService {

    @GET
    Call<MyPlaces>getNearbyPlaces(@Url String url);
}
