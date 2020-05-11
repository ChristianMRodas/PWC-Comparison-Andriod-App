package com.example.pwccomparisonandriodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FAQActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faq)

        //Sets up the back button
        val navBackBtn = supportActionBar
        navBackBtn!!.title = "FAQ Page"
        //set back button
        navBackBtn.setDisplayHomeAsUpEnabled(true)
        navBackBtn.setDisplayHomeAsUpEnabled(true)
    }

    //Places back on the top of the naviation bar
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


}
