package com.example.tsurkov.testclear.activiy

import android.support.v7.app.AppCompatActivity
import com.example.tsurkov.testclear.view.IBaseView
import com.example.tsurkov.testclear.view.IOnLoadBehavior
import javax.inject.Inject

open class baseActivity(): AppCompatActivity(), IBaseView {
    @Inject
    lateinit var loadBehavior: IOnLoadBehavior
    override fun onLoadStart() = loadBehavior.onLoadStart()
    override fun onLoadComplete() = loadBehavior.onLoadComplete()
}