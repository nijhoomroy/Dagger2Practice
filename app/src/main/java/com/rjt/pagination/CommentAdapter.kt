package com.rjt.pagination

import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.rjt.pagination.Data.CommentModel
import com.rjt.pagination.View.CommentViewHolder

class CommentAdapter : PagedListAdapter<CommentModel, RecyclerView.ViewHolder>(REPO_COMPARATOR) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CommentViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val commentItem = getItem(position)
        if (commentItem != null) {
            (holder as CommentViewHolder).bind(commentItem)

        }
    }

    companion object {
        private val REPO_COMPARATOR = object : DiffUtil.ItemCallback<CommentModel>() {
            override fun areItemsTheSame(oldItem: CommentModel, newItem: CommentModel): Boolean =
                oldItem.name == newItem.name

            override fun areContentsTheSame(oldItem: CommentModel, newItem: CommentModel): Boolean =
                oldItem == newItem
        }
    }
}
