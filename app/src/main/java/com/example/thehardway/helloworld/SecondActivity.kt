package com.example.thehardway.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.setContentView
import java.util.*


class SecondActivity : AppCompatActivity() {

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = SecondActivityUI()
        view.setContentView(this)
        showRandomNumber(view)
    }

    fun showRandomNumber(view: SecondActivityUI) {
        val count = intent.getIntExtra(TOTAL_COUNT, 0)
        val random = Random()

        var randomInt = 0

        if(count > 0){
            randomInt = random.nextInt(count + 1)
        }

        view.textRandom.text = Integer.toString(randomInt)
        view.textHeader.text = getString(R.string.random_heading, count)
    }
}
