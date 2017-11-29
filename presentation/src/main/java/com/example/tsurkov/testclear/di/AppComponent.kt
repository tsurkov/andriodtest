package com.example.tsurkov.testclear.di

import com.example.tsurkov.testclear.activiy.MainActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by tsurkov on 28.11.2017.
 */

@Component(modules = arrayOf(AppModule::class))
@Singleton
interface AppComponent{
    fun plus(mainActivityModule: MainActivityModule):MainActivityComponent
}