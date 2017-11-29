package com.example.tsurkov.testclear.activiy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.tsurkov.testclear.App
import com.example.tsurkov.testclear.R
import com.example.tsurkov.testclear.di.DaggerAppComponent
import com.example.tsurkov.testclear.di.MainActivityModule
import com.example.tsurkov.testclear.presenter.MainPresenter
import com.example.tsurkov.testclear.view.DoNothingOnLoadBehavior
import com.example.tsurkov.testclear.view.IMainView
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : baseActivity(), IMainView {

    @Inject
    protected lateinit var presenter: MainPresenter

    override fun showText(text: String) {
        tvHelloWorld.text = text
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        App.instance.buildMainActivityComponent(this)

        App.instance.getMainActivityComponent().inject(this)
    }

    override fun onDestroy() {
        App.instance.destroyMainActivityComponent()
        super.onDestroy()
    }
}
