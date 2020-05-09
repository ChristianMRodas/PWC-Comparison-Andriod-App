package com.example.pwccomparisonandriodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_yamaha.*

class YamahaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yamaha)



        //Initializes next spinner (models) for the user to pick from
        val spinnerY: Spinner = findViewById(R.id.models_spinnerr)

        ArrayAdapter.createFromResource(
            this,R.array.models_Yamaha_array,android.R.layout.simple_spinner_item).also {
                adapter ->
            adapter.setDropDownViewResource(android.R.layout.select_dialog_singlechoice)
            spinnerY.adapter = adapter

        }

        spinnerY.setOnItemSelectedListener(object : OnItemSelectedListener {
            override fun onItemSelected(
                adapterView: AdapterView<*>?,
                view: View?,
                p: Int,
                l: Long
            ) {
                //Makes a toast from what the user selected in the spinner
                //Toast.makeText(this@SecondActivity, spinner2.selectedItem.toString(),   Toast.LENGTH_SHORT).show()

                val text: String = spinnerY.getSelectedItem().toString()
                val selectedItem = spinnerY.getItemAtPosition(p)

                //Changes image depending on user selection
                //If user changes selection, image is removed (hidden)

                //Yamaha Images
                /*
                if (selectedItem.equals("EX") == true) {
                    Toast.makeText(this@YamahaActivity, "Selected: EX model", Toast.LENGTH_SHORT)
                        .show()

                    imgB_EX.visibility = View.VISIBLE
                }
                else
                    imgB_EX.visibility = View.INVISIBLE
                    */



            }
            override fun onNothingSelected(adapterView: AdapterView<*>?) {
                return
            }


        })






    }
}
