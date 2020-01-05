package com.rjt.pagination

import android.app.Application
import com.rjt.pagination.Components.CommentComponent
import com.rjt.pagination.Components.DaggerCommentComponent
import com.rjt.pagination.Components.DaggerRepositoryComponent
import com.rjt.pagination.Components.RepositoryComponent
import com.rjt.pagination.Data.Repository
import com.rjt.pagination.Modules.CommentServiceModule
import com.rjt.pagination.Modules.RepositoryModule


class BaseApplication: Application() {

    //Add components

    private lateinit var commentComponent: CommentComponent
    private lateinit var repositoryComponent: RepositoryComponent

    override fun onCreate() {
        super.onCreate()

        var commentComponent = DaggerCommentComponent.builder().commentServiceModule(CommentServiceModule(this)).build()



        var repositoryComponent = DaggerRepositoryComponent.builder().repositoryModule(RepositoryModule(this)).build()



    }

    fun getCommentComponent(): CommentComponent {

        return commentComponent
}

    fun getRepositoryComponent(): RepositoryComponent{
    return repositoryComponent

}
}