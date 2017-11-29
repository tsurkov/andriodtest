package com.example.tsurkov.testclear.presenter

import com.example.tsurkov.testclear.view.IMainView

/**
 * Created by tsurkov on 28.11.2017.
 */
class MainPresenter(view: IMainView): basePresenter() {
    init {
        view.showText("Hello World from presenter")
    }
}