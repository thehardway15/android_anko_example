package com.example.thehardway.helloworld

import android.graphics.Color
import android.graphics.Typeface
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivityUI: AnkoComponent<MainActivity> {

    lateinit var textView: TextView
    lateinit var random_button: Button
    lateinit var count_button: Button
    lateinit var toast_button: Button

    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        frameLayout {
            backgroundResource = R.color.screenBackground
            layoutParams = ViewGroup.LayoutParams(matchParent, matchParent)

            textView = textView("0") {
                id = Ids.textView
                textColor = Color.WHITE
                textSize = 72f
                typeface = Typeface.SANS_SERIF
            }.lparams(width = wrapContent, height = wrapContent) {
                gravity = Gravity.CENTER
                bottomMargin = dip(30)
            }

            linearLayout {
                toast_button = button("Toast") {
                    id = Ids.toast_button
                    backgroundResource = R.color.buttonBackground
                }.lparams() {
                    rightMargin = dip(8)
                }
                count_button = button("Count") {
                    id = Ids.count_button
                    backgroundResource = R.color.buttonBackground
                }.lparams() {
                    rightMargin = dip(8)
                    leftMargin = dip(8)
                }
                random_button = button("Random") {
                    id = Ids.random_button
                    backgroundResource = R.color.buttonBackground
                }.lparams() {
                    leftMargin = dip(8)
                }
            }.lparams(width = wrapContent, height = wrapContent) {
                gravity = Gravity.CENTER_HORIZONTAL + Gravity.BOTTOM
                bottomMargin = dip(30)
            }

        }
    }

    private object Ids {
        val textView = 1
        val random_button = 2
        val count_button = 3
        val toast_button = 4
    }
}