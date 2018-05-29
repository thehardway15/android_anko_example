package com.example.thehardway.helloworld

import android.graphics.Color
import android.graphics.Typeface
import android.view.ViewGroup
import org.jetbrains.anko.*
import android.view.Gravity
import android.widget.TextView

class SecondActivityUI: AnkoComponent<SecondActivity> {

    lateinit var textHeader: TextView
    lateinit var textRandom: TextView

    override fun createView(ui: AnkoContext<SecondActivity>) = with(ui) {
        frameLayout {
            backgroundResource = R.color.screenBackground2
            layoutParams = ViewGroup.LayoutParams(matchParent, matchParent)

            textHeader = textView(R.string.random_heading) {
                id = Ids.textViewLabel
                textColor = R.color.colorPrimaryDark
                textSize = 24f
            }.lparams(width = matchParent, height = wrapContent) {
                topMargin = dip(24)
                leftMargin = dip(24)
                rightMargin = dip(24)
                gravity = Gravity.TOP
            }
            textRandom = textView("0") {
                id = Ids.textview_random
                textColor = Color.WHITE
                textSize = 72f
                typeface = Typeface.DEFAULT_BOLD
            }.lparams(width = wrapContent, height = wrapContent) {
                gravity = Gravity.CENTER
            }

        }
    }

    private object Ids {
        val textViewLabel = 1
        val textview_random = 2
    }
}