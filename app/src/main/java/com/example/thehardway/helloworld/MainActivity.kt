package com.example.thehardway.helloworld

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.setContentView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = MainActivityUI()
        view.setContentView(this)

        view.toast_button.onClick {
            toastMe()
        }

        view.count_button.onClick {
            countMe(view)
        }

        view.random_button.onClick {
            randomMe(view)
        }
    }

    fun toastMe() {
        val myToast = Toast.makeText(this, "Hello toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe(view: MainActivityUI) {
        val countString = view.textView.text.toString()

        var count: Int = Integer.parseInt(countString)
        count++

        view.textView.text = count.toString()
    }

    fun randomMe(view: MainActivityUI) {
        val randomIntent = Intent(this, SecondActivity::class.java)

        val countString = view.textView.text.toString()
        val count: Int = Integer.parseInt(countString)

        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)

        startActivity(randomIntent)
    }
}
