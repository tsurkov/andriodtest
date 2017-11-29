package com.example.tsurkov.testclear

import android.app.Application
import com.example.tsurkov.testclear.activiy.MainActivity
import com.example.tsurkov.testclear.di.*

class App: Application() {
    companion object {
        lateinit var instance:App
    }
    lateinit var appComponent:AppComponent
    init {
        instance = this
    }



    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }

    private var mainActivityComponent:MainActivityComponent? = null
    fun buildMainActivityComponent(activity: MainActivity){
        mainActivityComponent = appComponent.plus(MainActivityModule(activity))
    }
    fun getMainActivityComponent():MainActivityComponent{
        return mainActivityComponent?: throw SecurityException("mainActivityComponent is not initialized")
    }
    fun destroyMainActivityComponent(){
        mainActivityComponent = null
    }

}