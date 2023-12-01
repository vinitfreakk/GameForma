package com.accidentaldeveloper.allaboutvalorant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        val textView = findViewById<TextView>(R.id.textView);
        val letter = "GAME FORMA!"
        val stringBuilder1 = StringBuilder()
        val t1 = Thread {
            for (letters in letter) {
                stringBuilder1.append(letters)
                Thread.sleep(250)
                runOnUiThread {
                    textView.text = stringBuilder1.toString()
                }
            }
            val jump: Intent = Intent(this, MainActivity::class.java)
            startActivity(jump)
            finish()
        }.start()
    }
}