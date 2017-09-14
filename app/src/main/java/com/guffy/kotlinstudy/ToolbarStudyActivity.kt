package com.guffy.kotlinstudy

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import com.guffy.kotlinstudy.util.bindView

class ToolbarStudyActivity : AppCompatActivity() {

    val toolbar: Toolbar by bindView(R.id.toolbar)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar_study)
        init()
    }

    private fun init() {
       /// setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(true)
        supportActionBar?.setTitle("Guffy Toolbar")
        supportActionBar?.setDisplayShowHomeEnabled(true)
    }
}
