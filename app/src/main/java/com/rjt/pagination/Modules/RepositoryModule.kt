package com.rjt.pagination.Modules

import android.app.Application
import com.rjt.pagination.Data.Repository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule(application: Application){

    @Singleton
    @Provides
    fun  provideRepo() : Repository {
        return Repository()
    }
}