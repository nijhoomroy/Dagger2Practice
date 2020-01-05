package com.rjt.pagination.Data

import android.app.Application
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.rjt.pagination.BaseApplication
import com.rjt.pagination.Network.APIInterface
import com.rjt.pagination.Modules.CommentServiceModule
import dagger.Provides
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class Repository {

    @Inject
    lateinit var apiInterface: APIInterface


    fun getComments(application: Application): LiveData<List<CommentModel>> {

        (application as BaseApplication).getCommentComponent().injectCommentsServiceModule(this)

        val comments: MutableLiveData<List<CommentModel>> = MutableLiveData()

        val call = apiInterface.getCommentsAsync()

        call.enqueue(object : Callback<List<CommentModel>> {
            override fun onFailure(call: Call<List<CommentModel>>, t: Throwable) {

                Log.d("Network", "Error")
            }

            override fun onResponse(
                call: Call<List<CommentModel>>,
                response: Response<List<CommentModel>>
            ) {
                comments.value = response.body()
            }


        })

        return comments
    }
}
