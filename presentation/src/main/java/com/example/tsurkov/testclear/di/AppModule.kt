package com.example.tsurkov.testclear.di

import android.content.Context
import com.example.tsurkov.testclear.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by tsurkov on 28.11.2017.
 */

@Module
class AppModule(var app: App) {
    @Singleton
    @Provides
    fun provideApp(): App{
        return app
    }
}