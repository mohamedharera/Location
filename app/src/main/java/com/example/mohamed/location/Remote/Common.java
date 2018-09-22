package com.example.mohamed.location.Remote;

/**
 * Created by Mohamed on 9/22/2018.
 */

public class Common {

    // https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=-33.8670522,151.1957362&radius=1500&type=market&sensor=true&key=YOUR_API_KEY

    private static final String GOOGLE_API_URL = "https://maps.googleapis.com/";

    public static IGoogleApiService getGoogleApiService(){
        return RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleApiService.class);
    }

}
