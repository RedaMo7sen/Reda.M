package com.asu.redamovies
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.onclick.*

class ForText : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onclick)
        textView.text = intent.getStringExtra("title")
        textView2.text = intent.getStringExtra("rate")
        textView3.text = intent.getStringExtra("ov")
    }
}