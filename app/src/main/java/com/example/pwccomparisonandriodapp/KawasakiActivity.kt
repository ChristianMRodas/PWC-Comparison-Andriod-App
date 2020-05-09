package com.example.pwccomparisonandriodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast


class KawasakiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kawasaki)


        //Initializes next spinner (models) for the user to pick from
        val spinnerK: Spinner = findViewById(R.id.models_spinnerr)

        ArrayAdapter.createFromResource(
            this,R.array.models_Kawasaki_array,android.R.layout.simple_spinner_item).also {
                adapter ->
            adapter.setDropDownViewResource(android.R.layout.select_dialog_singlechoice)
            spinnerK.adapter = adapter

        }















    }
}
