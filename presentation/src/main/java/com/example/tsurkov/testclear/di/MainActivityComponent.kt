package com.example.tsurkov.testclear.di

import com.example.tsurkov.testclear.activiy.MainActivity
import dagger.Subcomponent

@Subcomponent(modules = arrayOf(MainActivityModule::class))
@ForActivity
interface MainActivityComponent {
    fun inject(activity: MainActivity)
}