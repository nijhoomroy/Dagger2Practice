package com.rjt.pagination.View

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rjt.pagination.BaseApplication
import com.rjt.pagination.Data.CommentModel
import com.rjt.pagination.Data.Repository
import retrofit2.Call
import retrofit2.Response
import javax.inject.Inject


class CommentViewModel : ViewModel() {


    lateinit var commentsLiveData : LiveData<List<CommentModel>>

    @Inject
    lateinit var repository: Repository

    fun getComments(application: Application): LiveData<List<CommentModel>>{

        (application as BaseApplication).getRepositoryComponent().injectRepositoryModule(this)
       var commentsLiveData = repository.getComments(application as BaseApplication)


        return commentsLiveData
    }



}