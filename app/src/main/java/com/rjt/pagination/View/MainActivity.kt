package com.rjt.pagination.View

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.rjt.pagination.CommentAdapter
import com.rjt.pagination.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val adapter = CommentAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myCommentViewModel = ViewModelProvider(this).get(CommentViewModel::class.java)

       myCommentViewModel.getComments(application).observe(this, Observer {

           comment_recycler_view.adapter = adapter
           comment_recycler_view.layoutManager = LinearLayoutManager(this)
       })
    }



}
