package com.example.tsurkov.testclear.activiy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.tsurkov.testclear.R
import com.example.tsurkov.testclear.di.DaggerAppComponent
import com.example.tsurkov.testclear.di.MainActivityModule
import com.example.tsurkov.testclear.presenter.MainPresenter
import com.example.tsurkov.testclear.view.IMainView
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), IMainView {

    @Inject
    lateinit var presenter: MainPresenter

    override fun showText(text: String) {
        tvHelloWorld.text = text
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerAppComponent.builder().mainActivityModule(MainActivityModule(this)).build().inject(this)

    }
}
