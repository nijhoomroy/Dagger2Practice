package com.rjt.pagination.Network

import com.rjt.pagination.Data.CommentModel
import dagger.Provides
import retrofit2.Call
import retrofit2.http.GET


interface APIInterface {

    @GET("4/comments")
    fun getCommentsAsync(): Call<List<CommentModel>>
}