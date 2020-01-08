package com.karsang.foodmandu.API;

import com.karsang.foodmandu.Login_SingupResponse.Login_SingUpResponse;
import com.karsang.foodmandu.Model.UserModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface API {
    @POST("users/signup")
    Call<Login_SingUpResponse> userRegister(@Body UserModel user);

    @FormUrlEncoded
    @POST("users/login")
    Call<Login_SingUpResponse> userLogin(@Field("email") String email, @Field("password") String password);
}
