package com.example.moviecatalogue

import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=22e4d4586839c08ea88feaad694ec593")
    fun getMovieList(): Call<MovieResponse>

}