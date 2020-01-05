package com.rjt.pagination.Modules

import android.app.Application
import com.google.gson.Gson
import com.rjt.pagination.BaseApplication
import com.rjt.pagination.Network.APIInterface
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
class CommentServiceModule (application: Application){


    val BASE_URL = "https://jsonplaceholder.typicode.com/posts/"

    private var builder: Retrofit.Builder

    init {
        builder = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())

    }


    @Provides
    @Singleton
    fun createService(): APIInterface {
        val retrofit = builder.build()
        return retrofit.create(APIInterface::class.java)
    }
}