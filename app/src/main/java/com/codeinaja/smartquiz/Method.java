package com.codeinaja.smartquiz;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Method {

    @GET("api/users?page=2")
    Call<Model> getAllData();


}
