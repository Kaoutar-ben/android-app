package com.example.myapplication

import retrofit2.http.GET
import retrofit2.Call

interface ApiService {
    @GET("filter.php?a=Alcoholic")
    fun getDrinks(): Call<DrinkResponse>
}

data class DrinkResponse(
    val drinks: List<Drink>
)
