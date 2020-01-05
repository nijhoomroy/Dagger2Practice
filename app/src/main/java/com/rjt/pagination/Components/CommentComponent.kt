package com.rjt.pagination.Components

import com.rjt.pagination.Data.Repository
import com.rjt.pagination.Modules.CommentServiceModule
import com.rjt.pagination.View.CommentViewModel
import dagger.Component
import javax.inject.Singleton


    @Singleton
    @Component(modules = [CommentServiceModule::class])
    interface CommentComponent {
        fun injectCommentsServiceModule(repository: Repository)
    }
