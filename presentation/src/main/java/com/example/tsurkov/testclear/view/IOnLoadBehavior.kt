package com.example.tsurkov.testclear.view

import android.view.View
import android.widget.ProgressBar

interface IOnLoadBehavior {
    fun onLoadStart()
    fun onLoadComplete()
}

class  ShowProgressBarOnLoadBehavior(var pb : ProgressBar):IOnLoadBehavior{
    override fun onLoadStart() {
        pb.visibility = View.VISIBLE
    }

    override fun onLoadComplete() {
        pb.visibility = View.INVISIBLE
    }

}

class  DoNothingOnLoadBehavior():IOnLoadBehavior{
    override fun onLoadStart() {
    }

    override fun onLoadComplete() {
    }

}