package com.example.pwccomparisonandriodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //Initializes next spinner (models) for the user to pick from
        val spinner2: Spinner = findViewById(R.id.models_spinner)
        //val spinner = Spinner(this)

        //from arrat
        ArrayAdapter.createFromResource(
            this,R.array.models_Seadoo_array,android.R.layout.simple_spinner_item).also {
                adapter ->
            adapter.setDropDownViewResource(android.R.layout.select_dialog_singlechoice)
            spinner2.adapter = adapter

        }

        







    }
}
