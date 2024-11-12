package com.example.retrofitmarcelino.network

import com.example.retrofitmarcelino.model.Users
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("users?page=1")
    fun getAllUsers(): Call<Users>
}