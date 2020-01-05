package com.rjt.pagination.Components

import com.rjt.pagination.Data.Repository
import com.rjt.pagination.Modules.RepositoryModule
import com.rjt.pagination.View.CommentViewModel
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [RepositoryModule::class])
interface RepositoryComponent {
    fun injectRepositoryModule(viewModel: CommentViewModel)
}
