package com.example.tsurkov.testclear.di

import com.example.tsurkov.testclear.activiy.MainActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by tsurkov on 28.11.2017.
 */

@Component(modules = arrayOf(MainActivityModule::class))
@Singleton
interface AppComponent{
    fun inject(activity:MainActivity)

}