package com.guffy.kotlinstudy

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import com.guffy.kotlinstudy.util.bindView

class MyKotlinActivity : AppCompatActivity() {
    // lateinit var textView: TextView
    val textView: TextView  by bindView(R.id.textView)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_kotlin)
        //  textView = findViewById(R.id.textView) as TextView
    }

    public fun onClick(view: View) {
        //Toast.makeText(this, "Button Clicked", Toast.LENGTH_LONG).show()
        textView.setText("This is a long text")
    }
}
