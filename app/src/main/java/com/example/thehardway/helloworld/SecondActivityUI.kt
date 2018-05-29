package com.example.thehardway.helloworld

import android.graphics.Color
import android.graphics.Typeface
import android.view.ViewGroup
import org.jetbrains.anko.*
import org.jetbrains.anko.constraint.layout.constraintLayout
import android.support.constraint.ConstraintSet.PARENT_ID
import android.widget.TextView

class SecondActivityUI: AnkoComponent<SecondActivity> {

    lateinit var textHeader: TextView
    lateinit var textRandom: TextView

    override fun createView(ui: AnkoContext<SecondActivity>) = with(ui) {
        constraintLayout {
            backgroundResource = R.color.screenBackground2
            layoutParams = ViewGroup.LayoutParams(matchParent, matchParent)

            textHeader = textView(R.string.random_heading) {
                id = Ids.textViewLabel
                textColor = R.color.colorPrimaryDark
                textSize = 24f
            }.lparams(width = matchParent, height = wrapContent) {
                startToStart = PARENT_ID
                endToEnd = PARENT_ID
                topToTop = PARENT_ID
                topMargin = dip(24)
                leftMargin = dip(24)
                rightMargin = dip(24)
            }
            textRandom = textView("0") {
                id = Ids.textview_random
                textColor = Color.WHITE
                textSize = 72f
                typeface = Typeface.DEFAULT_BOLD
            }.lparams(width = wrapContent, height = wrapContent) {
                verticalBias = 0.45f
                topToBottom = Ids.textViewLabel
                startToStart = PARENT_ID
                endToEnd = PARENT_ID
                bottomToBottom = PARENT_ID
            }

        }
    }

    private object Ids {
        val textViewLabel = 1
        val textview_random = 2
    }
}