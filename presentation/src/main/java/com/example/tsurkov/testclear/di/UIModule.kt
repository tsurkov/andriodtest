package com.example.tsurkov.testclear.di

import com.example.tsurkov.testclear.activiy.MainActivity
import com.example.tsurkov.testclear.presenter.MainPresenter
import com.example.tsurkov.testclear.view.IMainView
import dagger.Module
import dagger.Provides

/**
 * Created by tsurkov on 28.11.2017.
 */

@Module
class MainActivityModule(var activity: MainActivity) {
    @Provides
    fun provideView():IMainView {
        return activity
    }
    @Provides
    fun provideMainPresenter(view: IMainView):MainPresenter{
        return MainPresenter(view)
    }
}