package com.example.benson.roadsideassistance;

import com.example.benson.roadsideassistance.models.ServerRequest;
import com.example.benson.roadsideassistance.models.ServerResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;


/**
 * Created by benson on 8/11/16.
 */
public interface RequestInterface {
    @POST("project/")
    Call<ServerResponse> operation(@Body ServerRequest request);
}
