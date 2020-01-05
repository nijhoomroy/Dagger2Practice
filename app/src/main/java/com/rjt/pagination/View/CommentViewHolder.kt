package com.rjt.pagination.View

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rjt.pagination.Data.CommentModel
import com.rjt.pagination.R
import kotlinx.android.synthetic.main.comment_list_view.view.*

class CommentViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private var commentModel: CommentModel? = null

    /*init {
        view.setOnClickListener {


            }
        }*/


    fun bind(commentModel: CommentModel) {
        itemView.text_view_name.text = commentModel.name
        itemView.text_view_email.text = commentModel.email
        itemView.text_view_body.text = commentModel.body

    }



    companion object {
        fun create(parent: ViewGroup): CommentViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.comment_list_view, parent, false)
            return CommentViewHolder(view)
        }
    }

}