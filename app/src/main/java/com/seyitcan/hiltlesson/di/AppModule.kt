package com.seyitcan.hiltlesson.di

import com.seyitcan.hiltlesson.Phone
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    fun provideTelefon(): Phone {
        return Phone("5454545454")
    }

}