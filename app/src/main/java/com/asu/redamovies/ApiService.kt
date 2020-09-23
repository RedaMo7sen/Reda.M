package com.asu.redamovies
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey : String = "b91ceed578679521425bc6e767a2572c",
        @Query("page") pageNumber: Int = 1
    ) : Call<MoviesResponse>
}